package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L09_Count_Positive_Negative_Zero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else {
                zero++;
            }
        }
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("Zero: "+zero);
    }
}
