package Basics_of_java.L04_Loops;

public class L05_Odd_numbers_1_to_100 {
    static void main(String[] args) {
        int x;
        for(x=1;x<=100;x++){
            if(x%2!=0){
                System.out.println(x);
            }
        }
    }
}
