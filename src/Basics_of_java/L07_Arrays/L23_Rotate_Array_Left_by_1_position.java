package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L23_Rotate_Array_Left_by_1_position {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for( i = 0; i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println("Modified Array: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
