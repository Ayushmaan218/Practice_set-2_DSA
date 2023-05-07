/*Create a superclass called Vehicle with two fields (Instance variables), make (String) and
model (String). Create a subclass called Car that adds a field numDoors. Implement the
appropriate constructors for both classes. */

import java.util.Scanner;

class Vehicle{
    String make;
    String model;
    Vehicle(String m,String m1){
        make = m;
        model = m1;
    }
}
class car extends Vehicle{
    int numDoors;
    car(String m,String m1,int n){
        super(m, m1);
        numDoors = n;
    }
}

public class p2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car Company");
        String N = sc.nextLine();
        System.out.println("Enter the model of the car");
        String m = sc.nextLine();
        System.out.println("Enter number of doors");
        int d = sc.nextInt();
        car c= new car(N, m, d);
        System.out.println(N+" "+m+" "+d);
    }
}
