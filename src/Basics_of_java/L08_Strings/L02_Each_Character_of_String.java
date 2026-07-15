package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L02_Each_Character_of_String {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String x = sc.nextLine();
        int i;
        for(i=0;i<x.length();i++){
            System.out.println(x.charAt(i));
        }
    }
}
