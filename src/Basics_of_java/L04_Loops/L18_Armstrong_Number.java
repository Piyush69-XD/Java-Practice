package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L18_Armstrong_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        int temp = x;
        int digit;
        int sum = 0;
        int temp1;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        temp = x;
        while(temp>0){
            digit = temp%10;
            temp1 = (int)Math.pow(digit,count);
            sum += temp1;
            temp /= 10;

        }
        if(sum==x) System.out.print("Armstrong ");
        else System.out.print("Not Armstrong");
    }
}
