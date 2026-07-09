package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L08_Volume_Of_Cone {
    public float volume(int a , int b ){
        return (1.0f/3)*3.14f*a*a*b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = sc.nextInt();
        System.out.print("Enter Height: ");
        int h = sc.nextInt();
        L08_Volume_Of_Cone obj = new L08_Volume_Of_Cone();
        float res = obj.volume(r,h);
        System.out.print("Volume of Cone: "+res);
    }
}
