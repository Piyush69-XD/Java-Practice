package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L03_Product {
    public int product(int a , int b){
        return a*b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int x = sc.nextInt();
        System.out.print("Second Number: ");
        int y = sc.nextInt();
        L03_Product obj = new L03_Product();
        int res = obj.product(x,y);
        System.out.print("Product = "+res);
    }
}
