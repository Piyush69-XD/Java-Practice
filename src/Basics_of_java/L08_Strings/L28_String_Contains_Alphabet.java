package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L28_String_Contains_Alphabet {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your String: ");
    String s1 = sc.nextLine();
    boolean isAlpha = true;

    for(int i=0;i<s1.length();i++){
        if(!Character.isAlphabetic(s1.charAt(i))){
            isAlpha = false;
            break;
        }
    }
    if(isAlpha){
        System.out.println("String Contains only alphabets");
    }
    else{
        System.out.println("String does not only contains alphabtes");
    }
}
}
