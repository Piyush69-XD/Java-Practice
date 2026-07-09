package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class pattern6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int i,j;
        for(i=1;i<=x;i++){
            for(j=1 ;j<=i;j++){
                System.out.print(2*(i-j));
            }

            System.out.println();
        }
    }
}
