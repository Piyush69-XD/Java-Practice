package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L11_Array_Reverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter elements of array: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed array: ");
        for(i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
