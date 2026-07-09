package Basics_of_java.L03_Conditionals;
import java.util.Scanner;
public class L01_voting_system {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int x = sc.nextInt();

        if (x<18 && x>0){
            System.out.print("You Can't vote");
        }
        else if (x>=18) {
            System.out.println("You can vote");
        }
        else System.out.println("Enter correct age ");

    }
}
