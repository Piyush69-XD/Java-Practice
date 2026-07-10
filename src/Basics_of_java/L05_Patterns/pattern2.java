package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class pattern2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int x = sc.nextInt();
        int i,j;
        for(i=1;i<=x;i++){
            for(j=1;j<=x;j++){
                if(i==1 || i==x || j==1 || j==x){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//        *****
//        *   *
//        *   *
//        *   *
//        *****