package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L08_Average_Of_All_Elements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size should be greater than 0.");
            return;
        }
        int arr[] =  new int[n];

        int i;
        System.out.println("Enter Array Elements: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(i=0;i<n;i++){
            sum += arr[i];
        }
        double  avg = (double) sum/n;
        System.out.print("Avg = "+avg);
    }
}
