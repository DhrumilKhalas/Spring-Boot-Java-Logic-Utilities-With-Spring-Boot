package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestMapping
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC Controller
public class FactorialController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/processFactorial")
    public String processFactorial(@RequestParam(value = "inputNumber") Integer inputNumber, Model model) {

        // Calculate the factorial of the input number
        long factorialResult = factorial(inputNumber);

        // Add the result and input number to the model to be used in the view
        model.addAttribute("result", factorialResult);
        model.addAttribute("inputNumber", inputNumber);

        // Return the name of the view (result_factorial) to be rendered
        return "result_factorial";
    }

    // A private method that calculates the factorial using recursion
    private long factorial(int n) {
        if (n == 0 || n == 1)
            return 1; // Base case: factorial of 0 or 1 is 1
        return n * factorial(n - 1); // Recursive case: n * factorial(n-1)
    }

}
