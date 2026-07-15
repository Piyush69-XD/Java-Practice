package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L01_Print_a_String {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String x = sc.nextLine();
        System.out.println("Your String is: "+x);
    }
}
