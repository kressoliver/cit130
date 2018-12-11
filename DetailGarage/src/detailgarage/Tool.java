
package detailgarage;

/**
 *
 * @author kress
 */
public class Tool {

    final int MAX_QUALITY = 100;
    private int toolQuality = 100;
    
    //create getters and setters for tool superclass
    public void simulateUse(int useDamage){
        toolQuality = toolQuality - useDamage;
    }
    public void restockTool(){
        toolQuality = MAX_QUALITY;
    }
    
    public int getToolQuality(){
        return toolQuality;
    }  
}
