package com.systemsolutions.pruebajoseyagua.controller;

import com.systemsolutions.pruebajoseyagua.Models.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class DeleteController {
    private JdbcTemplate jdbcTemplate;
    public DeleteController()
    {
        Conectar con=new Conectar();
        this.jdbcTemplate=new JdbcTemplate(con.conectar() );
    }
    
    @RequestMapping("delete.htm")
    public ModelAndView home(HttpServletRequest request) 
    {
        int id=Integer.parseInt(request.getParameter("id"));
        ///Falta Delete
        return new ModelAndView("redirect:/home.htm");
    }
}
