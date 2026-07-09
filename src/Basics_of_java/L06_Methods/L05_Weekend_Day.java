package Basics_of_java.L06_Methods;
import java.util.Scanner;
public class L05_Weekend_Day {
    public String weekend(int a){
        switch(a){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Enter correct day";
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        L05_Weekend_Day obj = new L05_Weekend_Day();
        String res = obj.weekend(x);
        System.out.print(res);
    }
}
//volume of cylinder
//area of circle
//volume of cone
