package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L20_Negative_Numbers_to_Beginning {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j = 0;
        for(i=0;i<n;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        System.out.println("Modified Array: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
