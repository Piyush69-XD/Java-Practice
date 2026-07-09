package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L16_Smallest_Digit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int min = 9;
        int digit;
        int temp = n;
        while(temp>0){
            digit = temp%10;
            if(digit<min){
                min = digit;
            }
            temp = temp/10;
        }
        System.out.print("Minimum Digit: "+min);
    }
}
