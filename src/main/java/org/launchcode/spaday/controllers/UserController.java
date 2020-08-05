package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.launchcode.spaday.models.*;

@Controller
@RequestMapping("")
public class UserController {

    @GetMapping("/user/add")
    public String displayAddUserForm(Model model){

        return "user/add";
   }

    @PostMapping("/user")
    public String processAddUserForm(Model model, @ModelAttribute User user, @RequestParam String verify, @RequestParam String username, @RequestParam String password, @RequestParam String email) {
        user.setUsername(username);

        model.addAttribute("username", username);
        model.addAttribute("email", email);


        if(verify.equals(user.getPassword())){
            return "/user/index";
        }
        else{
            model.addAttribute("error", "Passwords incorrect");
            return "/user/add";
        }

    }


    }
