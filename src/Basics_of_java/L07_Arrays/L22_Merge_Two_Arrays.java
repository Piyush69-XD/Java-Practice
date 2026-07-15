package Basics_of_java.L07_Arrays;
import java.util.Scanner;
public class L22_Merge_Two_Arrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of 1st Array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        int i;
        System.out.println("Enter Elements of First Array: ");
        for(i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Size of 2nd Array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter Elements Of 2nd Array: ");
        for(i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[n1+n2];
        for(i=0;i<n1;i++){
            merge[i]=arr1[i];
        }
        for(i=0;i<n2;i++){
            merge[n1+i]=arr2[i];
        }
        System.out.println("Merged Array: ");
        for(i=0;i<merge.length;i++){
            System.out.print(merge[i]+ " ");
        }

    }
}
