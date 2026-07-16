package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L07_Convert_to_Uppercase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        String res = "";
        for(int i = 0; i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch>='a' && ch <='z'){
                res = res + (char)(ch-32);
            }
            else {
                res = res + ch;
            }

        }
        System.out.println("Uppercase String: "+res);

    }
}
