package SOLID_Principles.OpenForExtensionClosedForModification;

public class PineAppleCake extends Cake {
    private int size;
    private float weight;
    public PineAppleCake(int size, float weight){
        super(size, weight);
        this.size=size;
        this.weight=weight;
    }
    
    private void addCream(){
        System.out.println("adding the white cream");
    }

    private void decorateCake(){
        System.out.println("decorating the cake");
        System.out.println("adding pineapple pieces");
    }

    public void bake(){
        super.bake();
        addCream();
        decorateCake();
        System.out.println("Pine Apple cake of size " + this.size +" inches and weight " + this.weight +" kg is ready");
    }
    
}
