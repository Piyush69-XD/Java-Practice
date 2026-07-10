package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L06_Sorted_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter array Elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }

        }
        if(flag){
            System.out.println("Array Sorted");
        }
        else System.out.println("Array Not Sorted");
    }
}
