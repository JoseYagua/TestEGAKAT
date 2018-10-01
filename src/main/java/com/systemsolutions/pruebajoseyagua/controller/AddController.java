package com.systemsolutions.pruebajoseyagua.controller;

import com.systemsolutions.pruebajoseyagua.Models.*;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;



@Controller
@RequestMapping("add.htm")
public class AddController {
    
    Validar valido;
    private JdbcTemplate jdbcTemplate;
    private String url="http://localhost:4545/ApiRestJoseYagua/resources/EGAKAT";
    ModelAndView mav;
    private RestTemplate restTemplate = new RestTemplate();
    
    public AddController() 
    {
        mav = new ModelAndView();
        this.valido = new Validar();
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar() );
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        mav.setViewName("add");
        mav.addObject("table",new table2());
        return mav;
    }
    
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login_post(
            @ModelAttribute("table") table2 u,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest re,
            Model model
    ) throws IOException {
        /*
        this.valido.validate(u, result);
        if (result.hasErrors()) {
            mav.setViewName("add");
            mav.addObject("table",new table2());
            return mav;
        } 
        else {
            */
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);
		HttpEntity<table2> entity = new HttpEntity<table2>(headers);
		try {
                ResponseEntity<table2> resulta = restTemplate.exchange(
                        url, HttpMethod.POST, entity, table2.class);
			
		} catch (Exception e) {
			
		}
            
            return new ModelAndView("redirect:/home.htm");
            //}
    }
    
    
    
   
}
