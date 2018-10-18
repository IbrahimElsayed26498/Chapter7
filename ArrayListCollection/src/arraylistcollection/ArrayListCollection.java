/*
In the name of Allah, the Gracious, the Merciful
 */
package arraylistcollection;
import java.util.ArrayList;
/**
 *
 * @author ibrahim
 */
public class ArrayListCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("red");//add item to the list
        items.add(0,"yellow");//insert item to the first index of the list
        
        System.out.printf("Display list contents with counter-controlled loop:");
        
        //display the colors of the list 
        for(int i=0; i<items.size(); i++)
            System.out.printf(" %s", items.get(i));
        display(items, "%nDisplay list contents with enhanced for statement:");
        
        items.add("green");
        items.add("yellow");
        display(items, "List 2 new elements:");
        
        items.remove("yellow");
        display(items, "remove first instance of yellow");
        
        items.remove(1);
        display(items,"remove second list element (green)");
        
        System.out.printf("\"red\" is %sin the list%n",(items.contains("red") ? "": "not "));
        
        System.out.printf("Size: %s%n", items.size());
        
    }
    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);
        
        // display each element in item
        for (String item : items) 
            System.out.printf(" %s", item);
        System.out.println();
    }
}
