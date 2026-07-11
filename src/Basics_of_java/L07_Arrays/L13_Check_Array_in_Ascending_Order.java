package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L13_Check_Array_in_Ascending_Order {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        int i;
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
            System.out.print("Array Sorted in Ascending Order");
        }
        else System.out.println("Array not sorted in ascending order");
    }
}
