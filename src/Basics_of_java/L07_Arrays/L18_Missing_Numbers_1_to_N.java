package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L18_Missing_Numbers_1_to_N {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n-1];
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int actual_sum = 0;
        for(i=0;i<n-1;i++){
            actual_sum += arr[i];
        }
        int expected_sum = (n*(n+1))/2;
        int missing_num = expected_sum-actual_sum;
        System.out.println("Missing Num: "+missing_num);
    }

}
