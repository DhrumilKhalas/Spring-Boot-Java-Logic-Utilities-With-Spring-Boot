package com.example.assignment_one;

// Importing necessary Spring packages for Controller, Model, and RequestParam
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC Controller
public class MatrixTransposeController {

    // The @GetMapping annotation maps HTTP GET requests to the method below
    @GetMapping("/processMatrixTranspose")
    public String processMatrixTranspose(@RequestParam(value = "matrixInput") String matrixInput, Model model) {

        // Parse the matrix input string into a 2D array
        String[][] matrix = parseMatrixInput(matrixInput);

        // Transpose the matrix
        String[][] transposedMatrix = transposeMatrix(matrix);

        // Convert the original and transposed matrices to strings for display
        String originalMatrixString = matrixToString(matrix);
        String transposedMatrixString = matrixToString(transposedMatrix);

        // Add the original and transposed matrix strings to the model
        model.addAttribute("originalMatrix", originalMatrixString);
        model.addAttribute("result", transposedMatrixString);

        // Return the name of the view (result_matrixTranspose) to be rendered
        return "result_matrixTranspose";
    }

    // A private method to parse the matrix input string into a 2D array
    private String[][] parseMatrixInput(String matrixInput) {

        // Split the input string by rows (line breaks)
        String[] rows = matrixInput.split("\\n");

        // Get the number of rows and columns from the input
        int numRows = rows.length;
        int numCols = rows[0].trim().split("\\s+").length;

        // Initialize a 2D matrix
        String[][] matrix = new String[numRows][numCols];

        // Iterate through each row and column to populate the matrix
        for (int i = 0; i < numRows; i++) {
            String[] values = rows[i].trim().split("\\s+");
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = values[j].trim();
            }
        }

        return matrix;
    }

    // A private method to transpose the matrix (swap rows and columns)
    private String[][] transposeMatrix(String[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize a new 2D array for the transposed matrix
        String[][] transposed = new String[cols][rows];

        // Loop through the matrix and swap rows with columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // A private method to convert a 2D matrix into a string format
    private String matrixToString(String[][] matrix) {
        StringBuilder builder = new StringBuilder();

        // Loop through each row and column to append the values to the string
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                builder.append(matrix[i][j]);
                if (j < matrix[i].length - 1)
                    builder.append(" "); // Add a space between elements in a row
            }
            if (i < matrix.length - 1)
                builder.append("\n"); // Add a new line after each row
        }
        return builder.toString();
    }

}
