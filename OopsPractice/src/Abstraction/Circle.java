package Abstraction;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public Circle(String color){
        this(color, 3);
    }

    @Override
    public double area(){
        double ar = 3.14 * radius * radius ;
        return ar;
    }

    @Override
    public String toString(){
        String str = "Color of the circle is " + super.getColor() + " and the area is " + area();
        return str;
    }
    

    
}
