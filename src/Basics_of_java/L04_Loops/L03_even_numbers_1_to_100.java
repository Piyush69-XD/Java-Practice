package Basics_of_java.L04_Loops;
import java.util.Scanner;
public class L03_even_numbers_1_to_100 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i;
        for(i=1;i<=x;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
