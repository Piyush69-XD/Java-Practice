package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L08_Divisible_by_3_and_5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();

        int i;
        for(i=1;i<=x;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
