package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L25_Replacing_Every_Space {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Sentence: ");
        String s1 = sc.nextLine();
        String res = "";
//      res = s1.replace(" ","_");
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                res +='_';
            }
            else {
                res += s1.charAt(i);
            }
        }
        System.out.println("Replaced String: "+res);
    }
}
