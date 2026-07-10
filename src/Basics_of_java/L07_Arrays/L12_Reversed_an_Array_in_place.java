package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L12_Reversed_an_Array_in_place {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int i;
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;

        while(start<end){
            int temp = arr [start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
