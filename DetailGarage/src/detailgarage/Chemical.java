
package detailgarage;

public class Chemical {
    
    private String chemicalName;
    private int percRemaining = 100;
    final int MAX_PERCENT = 100;
    //getter and setter methods for chemical superclass
    
    //create add fluid/remove fluid methods
    //interface inventoriable 
    public void simulateUse(int percentUsed){
        percRemaining = percRemaining - percentUsed;
    }
    public void restockChemical(){
        percRemaining = MAX_PERCENT;
    }
    
    public int getPercentRemaining(){
        return percRemaining;
    }  
    public void setChemicalName(String chemName){
        chemicalName = chemName;
    }
    public String getChemicalName(){
        return chemicalName;
    }
}
