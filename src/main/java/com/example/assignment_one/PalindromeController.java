package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestParam
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC Controller
public class PalindromeController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/processPalindrome")
    public String processPalindrome(@RequestParam(value = "inputString") String inputString, Model model) {

        // Check if the input string is a palindrome using the helper method
        boolean isPalindrome = isPalindrome(inputString);

        // Format the result message based on whether the string is a palindrome
        String resultMessage = String.format("Is '%s' palindrome?: %b", inputString, isPalindrome);

        // Add the result message to the model to be displayed in the view
        model.addAttribute("result", resultMessage);

        // Return the name of the view (result_palindrome) to be rendered
        return "result_palindrome";
    }

    // A private method that checks if a given string is a palindrome
    private boolean isPalindrome(String str) {

        // Reverse the string and compare it with the original string, ignoring case
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
