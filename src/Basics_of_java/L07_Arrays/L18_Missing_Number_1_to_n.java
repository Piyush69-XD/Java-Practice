package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L18_Missing_Number_1_to_n {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter elements of array:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int real_sum = 0;
        for(i=0;i<n;i++){
            real_sum += arr[i];
        }
        int expected_sum = n*((n+1)/2);
        int missing_num = real_sum-expected_sum;
        System.out.println("Missing Num: "+missing_num);
    }
}
