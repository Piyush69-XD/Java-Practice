package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L17_Palindrome_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int og = sc.nextInt();
        int temp = og;
        int digit;
        int rev = 0;
        while(temp>0){
            digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }
        if (rev==og) System.out.print("Palindrome");
        else System.out.print("Not Palindrome");
    }
}
