package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L09_Sum_Of_Even {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int i;
        int sum = 0;
        for(i=1;i<=n;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
