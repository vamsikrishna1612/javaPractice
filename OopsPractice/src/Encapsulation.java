import java.util.HashMap;

abstract class Animal{
  abstract void walk();
}
abstract class Horse extends Animal{
  abstract void eat();
}
class Chicken extends Animal{
  public void walk(){
    System.out.println("walks with 2 legs");
  }
  private void sound(){
    System.out.println("makes sound");
  }

}

public class Encapsulation {
  public static void main(String[] args) {

    HashMap<Integer, String> map = new HashMap<>();
    Horse horse = new Horse() {
      @Override
      void eat() {
        System.out.println("eating");
      }
      @Override
      void walk() {
        System.out.println("walking");
      }
    };
    horse.eat();
    Chicken chick = new Chicken();
    chick.walk();
  }

}
