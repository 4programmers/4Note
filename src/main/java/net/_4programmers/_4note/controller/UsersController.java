package net._4programmers._4note.controller;

import net._4programmers._4note.dao.UserDao;
import net._4programmers._4note.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/user/{userId}")
    public String displayById(@PathVariable Integer userId, Model model) {
        User user = userDao.findById(userId);

        if(user == null) {
            return "redirect:/";
        }

        model.addAttribute("user", user);

        return "user";
    }

    @RequestMapping("/register/{username}/{password}")
    public String insertWithUsernameAndPassword(@PathVariable String username, @PathVariable String password, Model model) {
        User user = userDao.create(username, password);

        model.addAttribute("user", user);

        return "inserted-user";
    }
}
