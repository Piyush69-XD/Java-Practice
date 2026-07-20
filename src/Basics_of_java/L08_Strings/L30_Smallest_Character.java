package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L30_Smallest_Character {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();
        char smallest =s1.charAt(0);
        for(int i=1;i<s1.length();i++){
            if(s1.charAt(i) != ' ' && s1.charAt(i) < smallest){
                smallest = s1.charAt(i);
            }
        }
        System.out.print("Smallest: "+smallest);
    }
}
