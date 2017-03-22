package com.abhishekparekh.twit.controllers;

import com.abhishekparekh.twit.models.Twit;
import com.abhishekparekh.twit.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.abhishekparekh.twit.services.TwitService;
import com.abhishekparekh.twit.services.UserService;

import java.security.Principal;

/**
 * Created by abhishek on 3/21/17.
 */
@Controller
public class TwitController {

    @Autowired
    private TwitService twitService;

    @Autowired
    private UserService userService;

    @RequestMapping({"","/twits"})
    public String twitList(Model model) {
        Iterable<Twit> twits = twitService.findAllTwits();
        model.addAttribute("twits",twits);
        model.addAttribute("newTwit",new Twit());
        return "/twits";
    }

    @RequestMapping( path = "/twit", method = RequestMethod.POST)
    public String addTwit(@ModelAttribute Twit twit, Principal principal) {
        User user = (User) ((UsernamePasswordAuthenticationToken)principal).getPrincipal();
        twit.setUser(user);
        twitService.save(twit);
        return "redirect:/";
    }

}
