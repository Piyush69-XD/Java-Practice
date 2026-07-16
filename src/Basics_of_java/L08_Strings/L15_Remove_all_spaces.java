package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L15_Remove_all_spaces {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        String res = "";
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                res = res+s1.charAt(i);
            }
        }
        System.out.print("New String: "+res);
    }
}
