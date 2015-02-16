package net._4programmers._4note.controllers;

import net._4programmers._4note.dao.UserDao;
import net._4programmers._4note.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/user/{userId}")
    public String getUser(@PathVariable int userId, Model model){
        User user = userDao.getUserById(userId);
        if(user == null) {
            return "redirect:/";
        }

        model.addAttribute("user", user);
        return "user";
    }
}
