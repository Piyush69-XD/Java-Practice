package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L16_Count_Frequency_of_Elements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter elements of array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean visited[] = new boolean[n];
        int count = 0;
        for (i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }

    }
}
