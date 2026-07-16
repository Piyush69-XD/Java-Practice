package Basics_of_java.L08_Strings;
import java.util.Scanner;
public class L19_First_Non_Repeating_Character {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String s1 = sc.nextLine();
        for(int i=0 ; i<s1.length();i++){
            if(s1.charAt(i)==' '){
                continue;
            }
            boolean visited = false;
            for(int j=0;j<i;j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    visited = true;
                    break;
                }
            }
            if(visited){
                continue;
            }
            int count = 1;
            for(int k = i+1;k<s1.length();k++){
                if(s1.charAt(i)==s1.charAt(k)){
                    count++;
                }
            }
            if(count==1){
                System.out.print("First Non Repeating Character: "+s1.charAt(i));
                break;
            }
        }
    }
    }

