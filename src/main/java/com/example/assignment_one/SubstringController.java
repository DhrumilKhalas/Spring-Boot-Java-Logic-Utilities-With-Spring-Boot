package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestParam
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC Controller
public class SubstringController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/checkSubstring")
    public String checkSubstring(@RequestParam(value = "s1") String s1,
            @RequestParam(value = "s2") String s2, Model model) {

        // Check if s2 is a substring of s1 using the contains() method
        boolean isSubstring = s1.contains(s2);

        // Add the result message to the model
        model.addAttribute("result", String.format("s1: \"%s\", s2: \"%s\". Is s2 a substring of s1?: %b", s1, s2, isSubstring));

        // Return the name of the view (result_substring) to be rendered
        return "result_substring";
    }
}
