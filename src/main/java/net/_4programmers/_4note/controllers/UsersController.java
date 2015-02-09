package net._4programmers._4note.controllers;

import net._4programmers._4note.dao.UserDao;
import net._4programmers._4note.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/user/{userId}")
    public String getUserById(@PathVariable int userId, Model model){
        model.addAttribute("user", userDao.getUserById(userId));
        return "user";
    }

    @RequestMapping("/") public String index(){
        return "index";
    }

    @RequestMapping("/index") public String index2(){
        return "index";
    }
}
