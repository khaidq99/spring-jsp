package com.example.demojsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World",
            required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/payment-form")
    public String paymentForm() {
        return "payment_form";
    }

    @PostMapping("/payment-confirmation")
    public String paymentConfirmation() {
        return "payment_confirmation";
    }
}
