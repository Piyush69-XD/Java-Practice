package Basics_of_java.L09_Objects_and_Classes.L04_Rectangle;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r1 = new rectangle();
        System.out.print("Enter Length: ");
        r1.length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        r1.breadth = sc.nextInt();

        r1.Calculate();

    }
}
