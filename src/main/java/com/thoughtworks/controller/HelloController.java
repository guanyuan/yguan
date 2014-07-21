package com.thoughtworks.controller;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by fxie on 7/21/14.
 */
@Controller
public class HelloController {


    @RequestMapping(value ="/about.html", method = RequestMethod.GET)
    public String returnQueryResult(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        return "about";
    }
}
