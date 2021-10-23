package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserDetails;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.InsuranceRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/add/user")
    public String prepareForm(Model model) {
        model.addAttribute("user", new User());
        return "users/form";
    }

    @PostMapping("/add/user")
    public String save(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "users/form";
        }
        userDao.persist(user);
        return "redirect:/user/form";
    }


    @RequestMapping("/user/persist")
    @ResponseBody
    public String persist() {
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName("Jan");
        userDetails.setLastName("Kowalski");

        User user = new User();
        user.setUserName("test123");
        user.setEmail("test123@o2.pl");
        user.setPassword("test123");
        user.setUserDetails(userDetails);

        userDao.persist(user);
        return "Jest sukces!";
    }

    @GetMapping("/user/findById/{id}")
    @ResponseBody
    public String findById(@PathVariable("id") long id) {
        User user = userDao.findById(id);
        return user.toString();
    }

    @GetMapping("/user/merge/{id}")
    @ResponseBody
    public String merge(@PathVariable("id") long id) {
        User user = userDao.findById(id);
        user.setPassword("Nowe haslo");
        user.getUserDetails().setFirstName("Maks");
        userDao.merge(user);
        return "Zaktualizowano osobe o id " + id;
    }

    @GetMapping("/user/remove/{id}")
    @ResponseBody
    public String remove(@PathVariable("id") long id) {
        User user = userDao.findById(id);
        userDao.remove(user);
        return "Usunieto osobe";
    }

    @GetMapping("/userForm/list")
    public String userList(Model model) {
        model.addAttribute("allUserList", userDao.findAll());
        return "users/all";
    }


}
