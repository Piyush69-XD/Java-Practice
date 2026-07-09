package Basics_of_java.L02_Operators;
import java.util.Scanner;
public class L05_area_of_rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        int res = l*b;

        System.out.println("Area of Rectangle: " + res);
    }
}
