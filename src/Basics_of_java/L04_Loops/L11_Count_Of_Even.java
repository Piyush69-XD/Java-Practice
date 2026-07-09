package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L11_Count_Of_Even {
    static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        int i;
        for(i=1;i<=n;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Count = "+count);
    }
}
