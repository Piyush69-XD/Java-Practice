package Basics_of_java.L04_Loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class L10_Sum_Of_Odd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int i;
        int sum = 0;
        for(i=1;i<=n;i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
