package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class pattern8 {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//                     *
//                    ***
//                   *****
//                  *******
//                 *********