package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestMapping
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Marks this class as a Spring MVC Controller
public class GRASPController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/showGRASPExplanation")
    public String showGRASPExplanation(Model model) {

        // Add the explanation of GRASP principles to the model
        model.addAttribute("graspExplanation", getGRASPExplanation());

        // Return the name of the view (result_graspExplanation) to be rendered
        return "result_graspExplanation";
    }

    // A private method that returns the HTML content explaining the GRASP principles
    private String getGRASPExplanation() {
        return "<ul>" +
                "<li><strong>Creator:</strong> The Creator principle suggests that a class should be responsible for creating objects of other classes it has a relationship with, such as aggregation or composition. This minimizes class dependencies and improves maintainability (GeeksForGeeks, 2024, para. 4; Medium, 2023, para. 2).</li><br>"
                +
                "<li><strong>Information Expert:</strong> The Information Expert principle states that the class with the most relevant information should be responsible for a particular task. This leads to better cohesion and fewer unnecessary connections between classes (GeeksForGeeks, 2024, para. 5; Medium, 2023, para. 3).</li><br>"
                +
                "<li><strong>High Cohesion:</strong> High Cohesion means a class should focus on a specific responsibility. Classes with high cohesion are easier to understand, maintain, and reuse, as their functions are closely related (GeeksForGeeks, 2024, para. 7; Medium, 2023, para. 5).</li><br>"
                +
                "<li><strong>Polymorphism:</strong> Polymorphism allows different classes to be treated uniformly through a common interface. This principle helps create flexible systems by enabling code reuse and improving adaptability (GeeksForGeeks, 2024, para. 11; Medium, 2023, para. 7).</li><br>"
                +
                "<li><strong>Pure Fabrication:</strong> Pure Fabrication involves creating artificial classes to support system design, which are not tied to real-world concepts. These classes help achieve low coupling and high cohesion (GeeksForGeeks, 2024, para. 9; Medium, 2023, para. 8).</li><br>"
                +
                "<li><strong>Indirection:</strong> Indirection suggests using intermediary classes or abstractions to reduce the direct dependencies between classes. This enhances flexibility and makes systems easier to modify (GeeksForGeeks, 2024, para. 10).</li>"
                +
                "</ul>";
    }
}
