
package detailgarage;

public class Chemical {
    
    private String chemicalName;
    private int percRemaining = 100;
    final int MAX_PERCENT = 100;
    
    //getter and setter methods for chemical super type
    //not implemented yet use for future supply use
    public void simulateUse(int percentUsed){
        percRemaining = percRemaining - percentUsed;
    }
    //not implemented yet use for future supply use
    public void restockChemical(){
        percRemaining = MAX_PERCENT;
    }
    //not implemented yet use for future supply use
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

