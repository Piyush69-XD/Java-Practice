package Basics_of_java.L01basics;
import java.util.Scanner;
public class L03_input_string {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");

        String x = sc.nextLine();

        System.out.println("Your string is: " + x);

        System.out.print("Enter your second string:");
        String y = sc.next();
        System.out.println("Second string is: " + y);

    }


}

