package Basics_of_java.L09_Objects_and_Classes.L04_Rectangle;

public class rectangle {
    int length;
    int breadth;

    void Calculate(){
        System.out.println("Area: "+(length*breadth));
        System.out.println("Perimeter: "+(2*(length+breadth)));
    }
}
