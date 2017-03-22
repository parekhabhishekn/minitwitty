package com.abhishekparekh.twit.controllers;

import com.abhishekparekh.twit.models.User;
import javax.servlet.http.HttpServletRequest;

import com.abhishekparekh.twit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by abhishek on 3/21/17.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( path = "/login", method = RequestMethod.GET)
    public String loginForm(Model model, HttpServletRequest request)
    {
        model.addAttribute("user", new User());
        try {
            Object flash = request.getSession().getAttribute("flash");
            model.addAttribute("flash", flash);
            request.getSession().removeAttribute("flash");
        } catch (Exception ex){
            //ex.printStackTrace();
        }

        return "login";
    }

    @RequestMapping("/access_denied")
    public String accessDenied() {
        return "access_denied";
    }
}
