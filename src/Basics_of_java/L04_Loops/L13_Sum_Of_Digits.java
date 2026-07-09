package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L13_Sum_Of_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        int temp = n;
        int res = 0;
        int count = 0;
        while(temp>0){
            res = temp%10;
            count += res;
            temp = temp/10;
        }
        System.out.println("Sum = "+count);
    }
}
