package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L12_Check_Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        String temp = "";
        for(int i=s1.length()-1 ; i>=0;i--){
            char ch = s1.charAt(i);
            temp = temp + ch;
            temp = temp.toLowerCase();
        }
        if(s1.equals(temp)){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }
}
