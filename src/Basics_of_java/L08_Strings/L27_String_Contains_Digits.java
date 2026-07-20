package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L27_String_Contains_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        boolean isDigit = true;

        for(int i=0;i<s1.length();i++){
            if(!Character.isDigit(s1.charAt(i))){
                isDigit = false;
                break;
            }
        }

        if(isDigit){
            System.out.println("String Contains only digits ");
        }
        else {
            System.out.println("String does not contain only digits ");
        }
    }
}
