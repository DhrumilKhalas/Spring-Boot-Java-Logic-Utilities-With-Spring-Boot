// Function to validate the palindrome input
function validatePalindrome() {
    var inputString = document.getElementById('inputString').value;
    if (inputString === null || inputString === "" || inputString === undefined) {
        alert("Please enter a string for palindrome check.");
        return false; // Prevent form submission
    }
    return true; // Allow form submission if input is valid
}

// Function to validate the factorial input
function validateFactorial() {
    var inputNumber = document.getElementById('inputNumber').value;
    if (inputNumber === null || inputNumber === "" || inputNumber === undefined || inputNumber <= 0) {
        alert("Please enter a non-negative number for factorial.");
        return false; // Prevent form submission
    }
    return true; // Allow form submission if input is valid
}

// Function to validate the URL encoding input
function validateUrlEncoding() {
    var inputString = document.getElementById('inputStringUrl').value;
    if (inputString === null || inputString === "" || inputString === undefined) {
        alert("Please enter a string for URL encoding.");
        return false; // Prevent form submission
    }
    return true; // Allow form submission if input is valid
}

// Function to validate the substring check inputs
function validateSubstring() {
    var s1 = document.getElementById('inputString1').value;
    var s2 = document.getElementById('inputString2').value;
    if (s1 === null || s1 === "" || s1 === undefined || s2 === null || s2 === "" || s2 === undefined) {
        alert("Please enter both strings for substring check.");
        return false;  // Prevent form submission
    }
    return true; // Allow form submission if both inputs are valid
}

// Function to validate the matrix transpose input
function validateMatrixTranspose() {
    var matrixInput = document.getElementById('matrixInput').value;
    if (matrixInput === null || matrixInput === "" || matrixInput === undefined) {
        alert("Please enter a matrix for transpose.");
        return false; // Prevent form submission
    }
    return true; // Allow form submission if input is valid
}

// Function to validate the unique characters input
function validateUniqueCharacters() {
    var inputString = document.getElementById('inputStringUnique').value;
    if (inputString === null || inputString === "" || inputString === undefined) {
        alert("Please enter a string for unique characters check.");
        return false; // Prevent form submission
    }
    return true; // Allow form submission if input is valid
}

// Function to clear all input fields after a delay of 2 seconds
function clearAllInputs() {
    setTimeout(() => {
        const inputs = document.querySelectorAll('.form-input');
        inputs.forEach(input => {
            input.value = ''; // Clear the value of each input field
        });
    }, 2000);
    return true; // Allow the function to complete
}


