package Basics_of_java.L03_Conditionals;
import java.util.Scanner;

public class L03_calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/): ");

        char op = sc.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("Answer = " + (x + y));
                break;

            case '-':
                System.out.println("Answer = " + (x - y));
                break;

            case '*':
                System.out.println("Answer = " + (x * y));
                break;

            case '/':
                if (y != 0) {
                    System.out.println("Answer = " + (x / y));
                } else {
                    System.out.println("Division by zero is not possible.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }


    }
    }

