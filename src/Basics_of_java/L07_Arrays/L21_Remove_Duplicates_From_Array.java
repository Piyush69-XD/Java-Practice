package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L21_Remove_Duplicates_From_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Modified Array: ");
        for(int k =0; k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
