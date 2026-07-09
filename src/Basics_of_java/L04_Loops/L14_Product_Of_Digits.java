package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L14_Product_Of_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int x = sc.nextInt();
        int product = 1;
        int temp = x;
        int res;
        while(temp>0){
            res = temp%10;
            product *= res;
            temp /= 10;
        }
        System.out.print("Product = "+product);
    }
}
