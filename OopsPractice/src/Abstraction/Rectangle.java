package Abstraction;

public class Rectangle extends Shape {
    double length, width;
    public Rectangle(String color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    public String toString(){
        String str = "The color of the rectangle is "+ getColor() + " and the area is "+ area();
        return str;
    }
    
}
