package com.example.helpdesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class PageController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Help Desk");
        model.addAttribute("welcomeMessage", "Добро пожаловать");
        model.addAttribute("features", List.of("Поддержка", "Контакты", "База знаний"));
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        model.addAttribute("text", "эээ мы студенты");
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("supportEmail", "support@test.ru");
        model.addAttribute("phone", "+7 (000) 000-00-00");
        model.addAttribute("workTime", "Пн-Пт 09:00-18:00");
        return "contacts";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
}