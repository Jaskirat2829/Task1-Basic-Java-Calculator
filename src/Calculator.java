import java.util.*;
public class Calculator {
    //user defined functions for arithmetic operations to be performed for the calcaulation
    public static double add(double a , double b){
        return a + b;
    }//function to perform addition
    public static double subtract(double a, double b){
        return a - b;
    }//function to perform subtraction
    public static double multiply(double a, double b){
        return a * b;
    }//function to perform multiplication
    public static double divide(double a , double b){
        if(b==0){
            System.out.println("cannot divide by zero");//check if the denominator(b) is zero which can cause error while calculations
            //if b is zero then error message is displayed and NaN is returned which meand Not a Number
            //otherwise the division is performed amd the result will be returned
            return Double.NaN;
        }
        return a / b;
    }
    //this is where the program execution starts
    //inside it we handle input and output operations and logic for selecting the arithmetic operation
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in); //this creates a scanner object named scanner to read input from the user
            boolean continueCalculation = true;
            System.out.println("====================================");
            System.out.println("Welcome to the Simple Calculator");
            System.out.println("====================================");
            //loop to continue calculations unitl the user decides to exit from the calculator
            while (continueCalculation){
                System.out.println("\nSelect an operation");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");
                System.out.println("Enter the choice (1-5):");//this prints the list of avialble calculator operations 
                int choice = scanner.nextInt();//taking user input after selecting the operation need to perform
                if(choice == 5){
                    continueCalculation = false;
                    System.out.println("Exiting the calculator. Thank you for choosing me!");
                    break;
                }//if the user selects 5 the loop will break and the continueCalculation will be set to false
                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();
                double result;
                switch (choice) {
                    case 1:
                        result = add(num1 ,num2);
                        System.out.println("Result is :" + result);
                        break;
                    case 2:
                        result = subtract(num1 ,num2);
                        System.out.println("Result is :" + result);
                        break;
                    case 3:
                        result = multiply(num1 ,num2);
                        System.out.println("Result is :" + result);
                        break;
                    case 4:
                        result = divide(num1 ,num2);
                        //Double.isNaN(result) returns true if the result value is NaN
                        //! not operator means we only need to print the rezsult if it is NOT NaN
                        if(!Double.isNaN(result)){
                            System.out.println("Result is :" + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please select a valid operation."); 
                        break;
                }
            }
            scanner.close();//closing the scanner object to prevent resource leaks
    }
}
