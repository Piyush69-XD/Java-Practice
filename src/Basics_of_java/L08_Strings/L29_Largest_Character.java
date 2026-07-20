package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L29_Largest_Character {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s1 = sc.nextLine();
        char largest = s1.charAt(0);
        for(int i=1;i<s1.length();i++){
            if(s1.charAt(i)>largest){
                largest = s1.charAt(i);
            }
        }
        System.out.print("Largest = "+largest);
    }
}
