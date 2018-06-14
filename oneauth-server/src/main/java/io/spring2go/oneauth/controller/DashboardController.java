package io.spring2go.oneauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DashboardController {

    @GetMapping
    public String indexPage() {
        return "index";
    }

    @GetMapping("/login.html")
    public String loginPage() {
        return "login";
    }

}
