package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L01_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        int marks[] = new int[n];

        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]);
        }
    }

}
