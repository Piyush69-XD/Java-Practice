package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L05_Count_Even_Odd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter Elements of Array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        int zero = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Zero: " + zero);
    }
}
