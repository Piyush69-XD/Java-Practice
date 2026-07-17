package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L24_Rotate_Array_Right_by_1_position {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter elements of array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];
        for(i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println("Modified Array: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
