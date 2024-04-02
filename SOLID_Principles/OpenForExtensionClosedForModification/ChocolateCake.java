package SOLID_Principles.OpenForExtensionClosedForModification;

public class ChocolateCake extends Cake {
    private int size;
    private float weight;
    public ChocolateCake(int size, float weight){
        super(size, weight);
        this.size=size;
        this.weight=weight;
    }

    public void bake(){
        super.bake();
        addCream();
        decorateCake();
        System.out.println("Chocolate cake of size " + this.size +" inches and weight " + this.weight +" kg is ready");
    }

    private void decorateCake() {
        System.out.println("decorating the cake");
        System.out.println("adding chocolate syrup");
    }

    private void addCream() {
        System.out.println("adding the white cream");
    }
    
}
