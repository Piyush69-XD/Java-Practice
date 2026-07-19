package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L26_Count_Occurences_of_Character {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter a character to count: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Occurences of '"+ch+"' in string = "+count);
    }
}
