package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L18_Reverse_Words_in_Order {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        int end = s1.length()-1;
        for(int i = s1.length()-1;i>=0;i--){
            if(s1.charAt(i)==' '){
                for(int j = i+1;j<=end;j++){
                    System.out.print(s1.charAt(j));
                }
                System.out.print(" ");
                end = i-1;
            }
        }
        for(int j =0; j<=end;j++){
            System.out.print(s1.charAt(j));
        }
    }
}
