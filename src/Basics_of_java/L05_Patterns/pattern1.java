package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class pattern1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int x = sc.nextInt();
        int i,j;
        for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
