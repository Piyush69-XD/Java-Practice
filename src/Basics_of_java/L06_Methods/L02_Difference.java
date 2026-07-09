package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L02_Difference {
    public int diff(int a , int b){
        return a-b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int x = sc.nextInt();
        System.out.print("Second Number: ");
        int y = sc.nextInt();
        L02_Difference obj = new L02_Difference();
        int res = obj.diff(x,y);
        System.out.print("Difference "+res);
    }
}
