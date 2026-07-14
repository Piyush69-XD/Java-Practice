package Basics_of_java.L09_Objects_and_Classes.L05_Constructor_Basic;
import java.util.Scanner;
public class L01_Basic {
    L01_Basic(int num , int num2){
        System.out.println("Num1: "+num);
        System.out.println("Num2: "+num2);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int x = sc.nextInt();
        System.out.print("Enter Second num: ");
        int y = sc.nextInt();
        L01_Basic obj = new L01_Basic(x,y);
    }
}
