package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L09_Simple_Interest {
    public int simple_interest(int a , int b , int c){
        return (a*b*c)/100;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int p = sc.nextInt();
        System.out.print("Enter Rate: ");
        int r = sc.nextInt();
        System.out.print("Enter Time in years: ");
        int t = sc.nextInt();

        L09_Simple_Interest obj = new L09_Simple_Interest();
        int res = obj.simple_interest(p,r,t);
        System.out.print("Simple Interest: "+res);
    }
}
