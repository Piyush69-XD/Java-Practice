package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L19_Prime_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        Boolean IsPrime = true;

        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
                IsPrime = false;
            }
        }
        if (IsPrime) System.out.println("Prime Number");
        else System.out.println("Not Prime");
    }
}
