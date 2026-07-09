package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L02_while_Loop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();

        while (x>0){
            System.out.println(x);
            x--;
        }
    }
}
