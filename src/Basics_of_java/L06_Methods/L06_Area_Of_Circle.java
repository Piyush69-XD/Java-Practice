package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L06_Area_Of_Circle {
    public float area(int a){
        return 3.14f*a*a;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = sc.nextInt();
        L06_Area_Of_Circle obj = new L06_Area_Of_Circle();
        float res = obj.area(r);
        System.out.print("Area of Circle: "+res);
    }
}
