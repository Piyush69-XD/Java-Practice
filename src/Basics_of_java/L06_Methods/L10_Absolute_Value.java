package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L10_Absolute_Value {
public int absolute(int n){
    if(n<0){
        return -n;
    }
    else return n;
}

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int x = sc.nextInt();
        L10_Absolute_Value obj = new L10_Absolute_Value();
        int res = obj.absolute(x);
        System.out.print("Absolute Value: "+res);
    }
}
