package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserDetails;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.InsuranceRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/user/form")
    public String prepareForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/user/form")
    @ResponseBody
    public String save(User user) {
        userDao.persist(user);
        return "Udalo sie zapisac";
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

}
