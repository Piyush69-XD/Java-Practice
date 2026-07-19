package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L24_Longest_Word_in_Sentence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Sentence: ");
        String s1 = sc.nextLine();
        String current = "";
        String longest = "";
        int i;
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                current += s1.charAt(i);
            }
            if(s1.charAt(i)==' ' || i==s1.length()-1){
                if(current.length()>longest.length()){
                    longest = current;
                }
                current="";
            }
        }
        System.out.println("Longest Word: "+longest);
        System.out.println("Length of Longest Word: "+longest.length());
    }
}
