/*Create a superclass called Shape with two fields, height and width, and a method getArea()
that returns the shape's area. Create a subclass called Rectangle that adds a method
getPerimeter() that returns the perimeter of the rectangle. Implement the appropriate
constructors for both classes. */

class shape{
    double height;
    double width;
    public shape(double h, double w){
        height = h;
        width = w;
    }
    public double getArea(){
        return height * width;
    }
}

class Rectangle extends shape{
    public Rectangle(double h, double w){
        super(h, w);
    }
    public double perimeter(){
        return 2*(height+width);
    }
}

public class p2q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.perimeter());
    }
}
