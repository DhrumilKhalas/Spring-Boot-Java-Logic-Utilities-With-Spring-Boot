package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestParam
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC Controller
public class UrlEncodingController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/processUrlEncoding")
    public String processUrlEncoding(@RequestParam(value = "inputString") String inputString, Model model) {

        // Replace spaces with "%20" for basic URL encoding
        String encodedString = inputString.replace(" ", "%20");

        // Add the encoded string to the model for display in the view
        model.addAttribute("result", encodedString);
        // Add the original input string to the model for display in the view
        model.addAttribute("inputString", inputString);
        // Return the name of the view (result_urlEncoding) to be rendered
        return "result_urlEncoding";
    }
}
