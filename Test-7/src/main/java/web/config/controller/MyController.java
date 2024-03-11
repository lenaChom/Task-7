package web.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import web.config.model.User;
import web.config.service.UserService;


import java.util.List;

@Controller
public class MyController {

    private UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String showAllUsers(Model model){
        List<User> allUser = userService.getAllUsers();
        model.addAttribute("allUsers", allUser);

        return "all-users";
    }

    @RequestMapping("/addNewUSer")
    public String addNewUser(Model model){
        User user = new User();
        model.addAttribute("user",user);

        return "user-info";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }



//    @GetMapping(value = "/")
//    public String printWelcome(Model model) {
//
//        List<String> messages = new ArrayList<>();
//        messages.add("Hello!");
//        messages.add("I'm Spring MVC application");
//        messages.add("5.2.0 version by sep'19 ");
//        model.addAttribute("messages", messages);
//        return "index";
//
//    }
}
