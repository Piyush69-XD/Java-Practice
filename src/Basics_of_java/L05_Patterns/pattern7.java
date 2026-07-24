package Basics_of_java.L05_Patterns;
import java.util.Scanner;
public class pattern7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int n = sc.nextInt();
        int x = 1;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

