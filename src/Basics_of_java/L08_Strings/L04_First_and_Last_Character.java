package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L04_First_and_Last_Character {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();
        System.out.println("First Character: "+s1.charAt(0));
        System.out.println("Last Character: "+s1.charAt(s1.length()-1));
    }

}
