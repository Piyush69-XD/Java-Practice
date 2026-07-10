package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L10_Copy_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int i;
        System.out.println("Enter elements of array: ");
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            arr2[i]=arr1[i];
        }
        System.out.println("Copied Array: ");
        for(i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
