package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L31_Remove_Whitespaces {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();

        String s2 = s1.trim();
        System.out.println("New Modified String: "+s2);
    }
}
