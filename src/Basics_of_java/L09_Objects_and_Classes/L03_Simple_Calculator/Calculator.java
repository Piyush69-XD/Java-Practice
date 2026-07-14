package Basics_of_java.L09_Objects_and_Classes.L03_Simple_Calculator;

public class Calculator {
    int num1;
    int num2;
    char operation;

    void calculate(){
        switch (operation){
            case '+':
                System.out.println("Result: "+(num1+num2));
                break;
            case '-':
                System.out.println("Result: "+(num1-num2));
                break;
            case '*':
                System.out.println("Result: "+(num1*num2));
                break;
            case '/':
                if(num2!=0) System.out.println("Result: "+(num1/num2));
                else System.out.println("Cannot Divide by Zero");
            default:
                System.out.println("Invalid Operation");
        }
    }
}
