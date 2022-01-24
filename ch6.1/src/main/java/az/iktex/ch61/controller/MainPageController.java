package az.iktex.ch61.controller;

import az.iktex.ch61.model.UserDTO;
import az.iktex.ch61.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {
    @Autowired
    private ProductService productService;

    @GetMapping("/main")
    public String main(Authentication a, Model model) {
        model.addAttribute("username", a.getName());
        model.addAttribute("products", productService.findAll());
        return "main.html";
    }

    @PostMapping("/create/user")
    public String createUser(UserDTO userDTO){
        System.out.println(userDTO.getUsername());
        return userDTO.getUsername();
    }
}
