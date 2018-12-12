
package detailgarage;


public class Applicator extends Tool implements Washable {
    private int soiledPercent =0;
    
    //override abstract methods from washable interface
    @Override
    public void becomeSoiled(){
    soiledPercent = soiledPercent + 100;
    }
    @Override
    public void wash(){
        soiledPercent = 0;
    }
}
