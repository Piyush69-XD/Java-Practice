package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class pattern3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of rows: ");
        int x = sc.nextInt();

        int i,j;
        for(i=x;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
