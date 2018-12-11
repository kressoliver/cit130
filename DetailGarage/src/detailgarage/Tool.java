
package detailgarage;

/**
 *
 * @author kress
 */
public class Tool {

    private String toolName;
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
    public void setToolName(String tName){
        toolName = tName;
    }
    public String getToolName(){
        return toolName;
    }
}
