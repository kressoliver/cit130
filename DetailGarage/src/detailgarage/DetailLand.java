
package detailgarage;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class DetailLand {

    public static void main(String[] args)throws InputMismatchException {
       
        //instantiate chemical objects and place into sets for chemicalMap'chemicalTypeScanner values
        
        Chemical colinite845 = new Sealant();
        colinite845.setChemicalName("colinite 845");
        Chemical powerLock = new Sealant();
        powerLock.setChemicalName("power lock");
        Chemical[] sealantArray = new Sealant[2];
        sealantArray[0] = colinite845;
        sealantArray[1] = powerLock;
        
        Chemical heavyPolish = new Polish();
        heavyPolish.setChemicalName("heavy polish");
        Chemical finePolish = new Polish();
        finePolish.setChemicalName("fine polish");
        Chemical[] polishArray = new Polish[2];
        polishArray[0] = finePolish;
        polishArray[1] = heavyPolish;
        
        Chemical hyperDressing = new Dressing();
        hyperDressing.setChemicalName("hyper dressing");
        hyperDressing.getChemicalName();
        Chemical[] dressingArray = new Dressing[1];
        dressingArray[0] = hyperDressing;
        
        HashMap<String, Chemical[]> chemicalMap = new HashMap();
        chemicalMap.put("sealants", sealantArray);
        chemicalMap.put("polishes", polishArray);
        chemicalMap.put("dressings", dressingArray);
        
        
        //instantiate tool objects and place into sets toolMap'chemicalTypeScanner values
        Tool wheelBrush = new Brush();
        wheelBrush.setToolName("wheel brush");
        Tool interiorBrush = new Brush();
        interiorBrush.setToolName("interior brush");
        Tool[] brushArray = new Brush[2];
        brushArray[0] = wheelBrush;
        brushArray[1] = interiorBrush;
        
        Tool foamApplicator = new Applicator();
        foamApplicator.setToolName("foam applicator");
        Tool microfiberApplicator = new Applicator();
        microfiberApplicator.setToolName("microfiber applicator");
        Tool[] appArray = new Applicator[2];
        appArray[0] = foamApplicator;
        appArray[1] = microfiberApplicator;
        
        Tool glassTowel = new Towel();
        glassTowel.setToolName("glass towel");
        Tool paintTowel = new Towel();
        paintTowel.setToolName("paint towel");
        Tool[] towelArray = new Towel[2];
        towelArray[0] = glassTowel;
        towelArray[1] = paintTowel;
      
        
        HashMap<String, Tool[]> toolMap = new HashMap();
        toolMap.put("brushes", brushArray);
        toolMap.put("towels", towelArray);
        toolMap.put("applicators", appArray);
        
        System.out.println("Welcome to your detail garage.");
        System.out.println("Please input 'chemicals' for chemicals,"
            + "'tools' for tools or 'exit' to exit ");                 
        
        
       Scanner scan = new Scanner(System.in);
      
       boolean whileControl = true;
       
       while(whileControl){
            String userSelection = scan.next();
            if(null == userSelection){
                    System.out.println("Please input 'chemicals' for chemicals,"
                            + "'tools' for tools or 'exit' to exit ");           
            }//close if
            else switch (userSelection) {            
                case "chemicals":
                    whileControl = false;
                    System.out.println("Which type of chemicals would you like to view?"
                            + "Please select 'dressings' 'sealants' or 'polishes' ");
                    Scanner chemicalTypeScanner = new Scanner(System.in);
                    String pickChemicalType = chemicalTypeScanner.next();
                    switch(pickChemicalType){
                        case "dressings":
                            System.out.println("reached dressings");
                            accessChemicals(dressingArray);
                                    break;
                        case "polishes":
                            accessChemicals(polishArray);
                            break;
                        case "sealants":
                            System.out.println("reached sealant");
                            accessChemicals(sealantArray);
                            break;
                        default:
                            System.out.println("Please select'dressings' 'sealants' or 'polishes' ");
                    }//close swithc
                    break;
                case "tools":
                    whileControl = false;
                    System.out.println("Which type of tools would you like to view?"
                            + " Please select 'brushes' 'towels' or 'applicators'");
                    Scanner toolScanner = new Scanner(System.in);
                    String pickToolType = toolScanner.next();
                    switch(pickToolType){
                        case "towels":
                            accessTools(towelArray);
                                    break;
                        case "applicators":
                            accessTools(appArray);
                            break;
                        case "brushes":
                            accessTools(brushArray);
                            break;
                        default:
                            System.out.println("Please select'dressings' 'sealants' or 'polishes' ");
                        break;
                       
                    }//close switch 
                    break;
                case "exit":
                    System.out.println("Have a nice day");
                    whileControl = false;
                    break;
                default:
                    System.out.println("Please input 'chemicals' for chemicals,"
                            + "'tools' for tools or 'exit' to exit ");
                    break;
            }
            
             }//close while
       }//close main

       public static void accessChemicals(Chemical[] c){
                    
                    System.out.print("You have the following in stock: ");
                    for (int i = 0; i < c.length;i++ ){
                    System.out.println(c[i].getChemicalName());
                    }//close for
      
    }//close method


           

       public static void accessTools(Tool[] t){
           
            System.out.print("You have the following in stock: ");
            for (int i = 0; i < t.length;i++ ){
            System.out.println(t[i].getToolName());
                    }//close for
//
           
    }//close method
}//close class