package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L07_Volume_Of_Cylinder {
    public float volume(int a , int b){
        return 3.14f*a*a*b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = sc.nextInt();
        System.out.print("Enter Height: ");
        int h = sc.nextInt();
        L07_Volume_Of_Cylinder obj = new L07_Volume_Of_Cylinder();
        float res = obj.volume(r,h);
        System.out.print("Volume Of Cylinder: "+res);
    }
}
