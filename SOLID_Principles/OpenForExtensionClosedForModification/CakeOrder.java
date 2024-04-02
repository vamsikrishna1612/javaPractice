import SOLID_Principles.OpenForExtensionClosedForModification.Cake;
import SOLID_Principles.OpenForExtensionClosedForModification.ChocolateCake;
import SOLID_Principles.OpenForExtensionClosedForModification.PineAppleCake;

public class CakeOrder {
    public static void main(String[] args){
        PineAppleCake cake = new PineAppleCake(4, 1.5f);
        cake.bake();
        Cake  choco = new ChocolateCake(3, 1.2f);
        choco.bake();
    }

    
}
