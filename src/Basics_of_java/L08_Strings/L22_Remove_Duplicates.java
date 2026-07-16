package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L22_Remove_Duplicates {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        String res = "";
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                continue;
            }
            boolean visited = false;
            for(int j =0;j<i;j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    visited = true;
                    break;
                }
            }
            if(!visited){
                res = res + s1.charAt(i);
            }
        }
        System.out.print("String after removing Duplicates: "+res);

    }
}
