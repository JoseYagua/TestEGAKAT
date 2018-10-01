package com.systemsolutions.pruebajoseyagua.controller;


import com.systemsolutions.pruebajoseyagua.Models.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("edit.htm")
public class EditController 
{
    Validar valido;
    private JdbcTemplate jdbcTemplate;
    ModelAndView mav;
     
    
    public EditController() 
    {
        this.valido=new Validar();
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar());
        mav = new ModelAndView();
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request) {
       int id=Integer.parseInt(request.getParameter("id"));
        mav.setViewName("edit");
        mav.addObject("table", new table2());
        return mav;
    }
        
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form_post(
            @ModelAttribute("table") table2 u,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest re,
            Model model
    ) throws IOException {
       this.valido.validate(u, result);
        if (result.hasErrors()) {
            int id=Integer.parseInt(re.getParameter("id"));
            mav.setViewName("edit");
            //mav.addObject("table",new table2(id,datos.getA(),datos.getB()));
            mav.addObject("table",new table2());
            return mav;
        } else {
                int id=Integer.parseInt(re.getParameter("id"));
        /*
        Falta Edit
        */
         return new ModelAndView("redirect:/home.htm");
        }
    }
        
}

