package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L15_Largest_Digit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        int digit;
        int temp = x;
        int res = 0;
        while(temp>0){
            digit = temp%10;
            if(digit>res){
            res = digit;
            }
            temp = temp/10;
        }
        System.out.print("Largest Digit = "+res);
    }
}
