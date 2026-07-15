package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L05_Count_Uppercase_Lowercase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        int i;
        int upper = 0;
        int lower = 0;
        for(i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
            else if(ch>='a' && ch<='z'){
                lower++;
            }
        }
        System.out.println("Uppercase Characters: "+upper);
        System.out.println("Lowercase Characters: "+lower);
    }
}
