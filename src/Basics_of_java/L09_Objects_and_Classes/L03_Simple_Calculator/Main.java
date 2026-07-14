package Basics_of_java.L09_Objects_and_Classes.L03_Simple_Calculator;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c1 = new Calculator();
        System.out.print("Enter First Num: ");
        c1.num1 = sc.nextInt();
        System.out.print("Enter Second Num: ");
        c1.num2 = sc.nextInt();
        System.out.println("Enter Operation to perform: ");
        c1.operation = sc.next().charAt(0);

        c1.calculate();
    }
}
