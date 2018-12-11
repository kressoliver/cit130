
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
       
        //instantiate chemical objects and place into sets for chemicalMap's values
        Chemical superClean = new Cleaner();
        Chemical superDegreaser = new Cleaner();
        Set<Chemical> cleanerSet = new HashSet();
        cleanerSet.add(superClean);
        cleanerSet.add(superDegreaser);
        
        Chemical colinite845 = new Sealant();
        Chemical powerLock = new Sealant();
        Set<Chemical> sealantSet = new HashSet();
        sealantSet.add(powerLock);
        sealantSet.add(colinite845);
        
        Chemical heavyPolish = new Polish();
        Chemical finePolish = new Polish();
        Set<Chemical> polishSet = new HashSet();
        polishSet.add(heavyPolish);
        polishSet.add(finePolish);
        
        Chemical hyperDressing = new Dressing();
        hyperDressing.setChemicalName("hyper dressing");
        hyperDressing.getChemicalName();
        Set<Chemical> dressingSet = new HashSet();
        dressingSet.add(hyperDressing);
        
        
        HashMap<String, Set<Chemical>> chemicalMap = new HashMap();
        chemicalMap.put("cleaners", cleanerSet);
        chemicalMap.put("sealants", sealantSet);
        chemicalMap.put("polishes", polishSet);
        chemicalMap.put("dressings", dressingSet);
        
        
        //instantiate tool objects and place into sets toolMap's values
        Tool wheelBrush = new Brush();
        Tool interiorBrush = new Brush();
        Set<Tool> brushSet = new HashSet();
        brushSet.add(wheelBrush);
        brushSet.add(interiorBrush);
        
        Tool foamApplicator = new Applicator();
        Tool microfiberApplicator = new Applicator();
        Set<Tool> appSet = new HashSet();
        appSet.add(foamApplicator);
        appSet.add(microfiberApplicator);
        
        Tool glassTowel = new Towel();
        Tool paintTowel = new Towel();
        Set<Tool> towelSet = new HashSet();
        towelSet.add(glassTowel);
        towelSet.add(paintTowel);
        
        HashMap<String, Set<Tool>> toolMap = new HashMap();
        toolMap.put("brushes", brushSet);
        toolMap.put("towels", towelSet);
        toolMap.put("applicators", appSet);
        
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
                    accessChemicals(chemicalMap);
                    whileControl = false;
                    break;
                case "tools":
                    accessTools(toolMap);
                    whileControl = false;
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

       public static void accessChemicals(Map m){

        Set chemKeys = m.keySet();
        Iterator chemIterator = chemKeys.iterator();
        
        while(chemIterator.hasNext()){
            System.out.print(chemIterator.next() +" ");
        }//close while
           System.out.println("");
           System.out.println("select one of the above chemical types to view");
           Scanner s = new Scanner(System.in);
           String accessScanner = s.next();        
           switch(accessScanner){
               case "dressings":
                    System.out.println("You have:" + m.get("dressings"));
                    break;
                case "sealants":
                    break;
               case "polishes":
                    break;
                case "cleaners":
                    break;
                default:
                    System.out.println("Please input one of the following: " + m.keySet());
                    break;
           }//close switch statements
           
    }//close method

       public static void accessTools(Map m){

        Set toolKeys = m.keySet();
        Iterator toolIterator = toolKeys.iterator();
        
        while(toolIterator.hasNext()){
            System.out.println(toolIterator.next());
        }//close while
           System.out.println("");
           Scanner s = new Scanner(System.in);
           String accessScanner = s.next();        
           switch(accessScanner){
               case "brushes":
                    break;
                case "towels":
                    break;
               case "applicators":
                    break;
                default:
                    System.out.println("Please input one of the following: " + m.keySet());
                    break;
           }//close switch statements
           
    }//close method
}//close class