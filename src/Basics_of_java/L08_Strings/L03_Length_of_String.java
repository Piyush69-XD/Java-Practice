package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L03_Length_of_String {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        int x = s.length();
        System.out.print("Length of String: "+x);
    }
}
