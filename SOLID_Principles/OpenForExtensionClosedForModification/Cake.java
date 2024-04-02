package SOLID_Principles.OpenForExtensionClosedForModification;

public class Cake {
    private int size;
    private float weight;
    public Cake(int size, float weight){
        this.size=size;
        this.weight = weight;
    }

    public void bakeCake(){
        System.out.println("Baking the cake with vanilla base");
        System.out.println("The size of the cake is " + size + 
                            " inches and weight is " + weight + "kg");
    }
    
}
