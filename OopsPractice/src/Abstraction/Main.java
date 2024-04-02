package Abstraction;

public class Main {
    public static void main(String[] args){
        // Shape shape = new Shape("white");
        Circle circle = new Circle("blue");
        Rectangle rectangle = new Rectangle("red",4, 6);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
    
}
