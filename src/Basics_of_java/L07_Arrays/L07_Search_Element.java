package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L07_Search_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int i;
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search in array: ");
        int x = sc.nextInt();
        boolean flag = false;

        for(i = 0; i < n; i++){
            if(x == arr[i]){
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
