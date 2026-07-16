package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L11_Reverse_String {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        String rev = "";
        for(int i =s1.length()-1;i>=0;i--){
            rev = rev + s1.charAt(i);
        }
        System.out.print("Reversed String: "+rev);

    }
}
