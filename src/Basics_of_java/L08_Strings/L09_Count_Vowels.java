package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L09_Count_Vowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        int vowel = 0;
        for(int i =0; i<s1.length();i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            if("aeiou".indexOf(ch)!=-1){
                vowel++;
            }

        }
        System.out.print("Vowels: "+vowel);
    }
}
