package Basics_of_java.L08_Strings;
import java.util.Arrays;
import java.util.Scanner;
public class L21_Check_Anagram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter your 2nd String: ");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.print("Not Anagram");
            return;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.print("Anagram");
        }
        else{
            System.out.print("Not Anagram");
        }

    }
}
