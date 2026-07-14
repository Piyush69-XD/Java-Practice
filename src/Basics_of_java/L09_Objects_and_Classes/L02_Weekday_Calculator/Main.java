package Basics_of_java.L09_Objects_and_Classes.L02_Weekday_Calculator;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        weekday w1 = new weekday();
        System.out.print("Enter day of the week: ");
        w1.day = sc.nextInt();
        w1.displayDay();
    }
}
