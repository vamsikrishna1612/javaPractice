package Abstraction;

public abstract class Shape {
    String color;
    abstract double area();
    public abstract String toString();
    
    public Shape(String color) {
        System.out.println("shape constructor is called");
        this.color = color;
    }
    String getColor(){
        return color ;
    }
}
