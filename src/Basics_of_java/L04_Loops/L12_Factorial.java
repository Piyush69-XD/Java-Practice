package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L12_Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int fact=1;
        int temp;
        temp = n;
        if(n==0 || n==1){
            System.out.print("Factorial = "+1);
        }
        else {
            while(temp>0) {
                fact = fact * temp;
                temp--;
            }
            System.out.print("Factorial = "+fact);
        }
    }
}
