package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L15_2nd_Smallest_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter Elements of array: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int second_min = Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            if(arr[i]!=min && arr[i]<second_min){
                second_min = arr[i];
            }

        }
        System.out.print("Second Min Element: "+second_min);
    }
}
