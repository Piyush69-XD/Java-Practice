package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L04_Max_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        int i;
        for(i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max Element: "+max);
    }
}
