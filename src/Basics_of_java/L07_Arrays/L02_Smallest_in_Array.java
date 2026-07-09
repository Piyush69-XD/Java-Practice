package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L02_Smallest_in_Array {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

        System.out.println("Enter array elements:");
        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(i=1;i<n;i++){
            min = Math.min(min,arr[i]);
        }

        System.out.print("Minimum Element: "+min);

    }
}
