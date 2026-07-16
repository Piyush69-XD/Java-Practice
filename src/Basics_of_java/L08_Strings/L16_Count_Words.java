package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L16_Count_Words {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        int count = 0;
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)!=' ' && (i==0||s1.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.print("Total Words are: "+count);
    }
}
