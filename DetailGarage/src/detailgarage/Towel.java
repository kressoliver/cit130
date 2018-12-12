
package detailgarage;

public class Towel extends Tool implements Washable {
    
    private int soiledPercent = 0;
    //override abstract methods from interface washable
    @Override
    public void becomeSoiled(){
    soiledPercent = soiledPercent + 100;
    }
    @Override
    public void wash(){
        soiledPercent = 0;
    }
}

