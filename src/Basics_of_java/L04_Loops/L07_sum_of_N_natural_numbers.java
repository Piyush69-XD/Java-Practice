package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L07_sum_of_N_natural_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i;
        int sum = 0;
        for(i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
