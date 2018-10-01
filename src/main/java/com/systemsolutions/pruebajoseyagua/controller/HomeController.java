package com.systemsolutions.pruebajoseyagua.controller;

import com.systemsolutions.pruebajoseyagua.Models.Conectar;
import com.systemsolutions.pruebajoseyagua.Models.table2;
import java.util.ArrayList;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController 
{
    private JdbcTemplate jdbcTemplate;
    private String url="http://localhost:4545/ApiRestJoseYagua/resources/EGAKAT";
    ModelAndView mav;
    private RestTemplate restTemplate = new RestTemplate();
    
    public HomeController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
        mav = new ModelAndView();
    }

    @RequestMapping(value = "home.htm", method = RequestMethod.GET)
    public ModelAndView login_get() {
        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);
		HttpEntity<table2> entity = new HttpEntity<table2>(headers);
                ResponseEntity<table2> resulta = restTemplate.exchange(
                        url, HttpMethod.GET, entity, table2.class);
        mav.addObject("datos",resulta);
        mav.setViewName("home");
        return mav;
    }
}