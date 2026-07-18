package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L23_String_Compression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s1 = sc.nextLine();
        String res = "";
        int count = 1;
        int i;
        for( i=0;i<s1.length();i++){
            if(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
                count++;
            }
            else {
                res += s1.charAt(i);
                res += count;
                count = 1;
            }
        }
        System.out.print("Compressed String: "+res);
    }
}
