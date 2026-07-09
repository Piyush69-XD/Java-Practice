package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L03_Sum_of_Elements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array");
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.print("Sum = "+sum);
    }
}
