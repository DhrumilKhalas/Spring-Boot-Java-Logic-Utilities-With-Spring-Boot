package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestParam
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC Controller
public class UniqueCharactersController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/checkUniqueCharacters")
    public String checkUniqueCharacters(@RequestParam(value = "inputString") String inputString, Model model) {

        // Check if the input string has all unique characters by calling the helper method
        boolean hasUniqueCharacters = areUniqueCharacters(inputString);

        // Add the result message to the model, indicating whether the string has all unique characters
        model.addAttribute("result",
                String.format("Does the string '%s' have all unique characters: %b", inputString, hasUniqueCharacters));

        // Return the name of the view (result_uniqueCharacters) to be rendered
        return "result_uniqueCharacters";
    }

    // A private method that checks if a given string has all unique characters
    private boolean areUniqueCharacters(String str) {

        // Create a boolean array to track the characters seen so far
        boolean[] charSet = new boolean[128]; // ASCII has 128 characters

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {

            // Get the ASCII value of the current character
            int val = str.charAt(i);

            // If the character has already been seen, return false (not unique)
            if (charSet[val]) {
                return false;
            }

            // Mark the character as seen
            charSet[val] = true;
        }

        // If no duplicate characters were found, return true (all characters are unique)
        return true;
    }
}
