package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class Pattern4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int x = sc.nextInt();
        int i,j;
        for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
//            1
//            22
//            333
//            4444
//            55555