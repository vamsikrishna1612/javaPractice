class Shape{
  public String color;

  public int getArea() {
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

  private int area;
  void displayArea(){
    System.out.println("displays area");
  }
}
class Triangle extends Shape {

  public int length;
  public int height;

  public void printColor() {
    System.out.println(this.color);
  }


    public static void main(String[] args){
      Triangle triangle = new Triangle();
      triangle.color = "yellow";
      triangle.printColor();
      triangle.displayArea();
      //triangle.area= 12;
    }
  }
