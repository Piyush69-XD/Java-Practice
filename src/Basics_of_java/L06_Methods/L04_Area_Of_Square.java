package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L04_Area_Of_Square {
    public int area(int a){
        return a*a;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int x = sc.nextInt();
        L04_Area_Of_Square obj = new L04_Area_Of_Square();
        int res = obj.area(x);
        System.out.print("Area = "+res);
    }
}
