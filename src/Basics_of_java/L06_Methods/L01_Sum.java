package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L01_Sum {
    public int sum(int a , int b){
        return a+b;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First No. ");
        int x = sc.nextInt();
        System.out.print("Second Number: ");
        int y = sc.nextInt();
        L01_Sum obj = new L01_Sum();
        int ans = obj.sum(x,y);
        System.out.print("Sum = "+ans);


    }
}
