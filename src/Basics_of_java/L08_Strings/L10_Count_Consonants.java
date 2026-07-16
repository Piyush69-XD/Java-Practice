package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L10_Count_Consonants {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        int cons = 0;
        for(int i = 0; i<s1.length();i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            if("aeiou".indexOf(ch)==-1){
                cons++;
            }
        }
        System.out.print("Consonants: "+cons);
    }
}
