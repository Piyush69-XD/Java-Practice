package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L06_Count_Alphabets_Special_Characters_Digits {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
       String s1 = sc.nextLine();
       int i;
        int alphabet = 0;
        int digit = 0;
        int special = 0;
       for(i=0;i<s1.length();i++){
           char ch = s1.charAt(i);

           if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')){
               alphabet++;
           }
           else if(ch>='0' && ch<='9'){
               digit++;
           }
           else if(ch==' '){
               continue;
           }
           else {
               special++;
           }
       }
        System.out.println("Alphabets in String: "+alphabet);
        System.out.println("Digits in String: "+digit);
        System.out.println("Special Characters in String: "+special);
    }
}
