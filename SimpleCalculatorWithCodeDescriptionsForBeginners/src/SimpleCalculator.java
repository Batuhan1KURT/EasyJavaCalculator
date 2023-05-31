import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		                           // TASK: CREATING THE FIRST BASIC CALCULATOR ON JAVA
//------------------------------------------------------------------------------------------------------------------------------------------------		
		
		/*
		  TASK DESCRIPTION:		  
		  --------------------------------------------
		  
		1.) Write a Java program that acts as a calculator. 
		
		2.) The program should prompt the user to enter two numbers and an operator (+, -, *, or /). 	
			
		3.) Based on the operator entered, the program should perform the corresponding operation and display the result to the user.
		
		  --------------------------------------------
		*/
		
		
		/*
		  STEPS:		  
		  --------------------------------------------	

		  1.) Import "Scanner" from "java.util library".
		  2.) Create a "Scanner".
		  3.) Get "First Number" input. You should get that input as a double for more accurate and usable calculator.
		  4.) Get "Second Number" input. You should get that input as a double for more accurate and usable calculator.
		  5.) Get "Operator" input.
		  6.) Create a "Result" variable to show the result. You should create this variable as a double for more accurate and usable calculator.
		  7.) Create a "Switch-Case" section for handling different operator inputs.
		  8.) Show the result on the console.
		  
		  --------------------------------------------
		*/
		
		
		
		
		//CODING SECTION ( With descriptions: )
		
		
		System.out.println("Enter the first number: ");
		//We wrote that message for the user to get the input for the first number.
		
		Scanner scanner = new Scanner(System.in);
		//We create the scanner to get user input for our program.
		
		double firstNumber = scanner.nextDouble();
		//"We're creating this variable to capture the user's first 'integer' input."		
		
		System.out.println("Enter the second number: ");
		//We wrote that message for the user to get the input for the second number.
		
		double secondNumber = scanner.nextDouble();
		//"We're creating this variable to capture the user's second 'integer' input."	
		
		System.out.println("Enter the operator (+, -, *, /): ");
		//We're sending this message to the console to get the user's operation selection.
		
		char operator = scanner.next().charAt(0);
		//We're creating this variable to capture the user's operator selection.
		
		double result = 0.0;
		//We're creating this variable to use later for showing the result.			
		
		
		//We will use the 'switch-case' operator to handle different "operator" inputs from the user.
		
		switch (operator) {
		    case'+':
		    	//If the user selects the '+' operator, this case section will be executed.
		    	result = firstNumber + secondNumber;
		        break;
		        
		    case '-':
		    	//If the user selects the '-' operator, this case section will be executed.
		    	result = firstNumber - secondNumber;
		    	break;
		    case '*': 
		    	//If the user selects the '*' operator, this case section will be executed.
		    	result = firstNumber * secondNumber;
		    	break;
		    case '/':
		    	//If the user selects the '/' operator, this case section will be executed.
		    	result = firstNumber / secondNumber;
		    	break;
		    default:
		    	System.out.println("Invalid operator!");
		    	return; //Exit the program if the operator is invalid.
		       
		
		}
		
		System.out.println("Result: " + result);
			
		
	}
	}