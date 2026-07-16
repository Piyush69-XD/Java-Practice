package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L17_Reverse_Words_in_String {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String word = "";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                word += s1.charAt(i);
            }
            else {
                for (int j = word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word = "";
            }
        }
        for(int j = word.length()-1;j>=0;j--){
            System.out.print(word.charAt(j));
        }


    }
}
