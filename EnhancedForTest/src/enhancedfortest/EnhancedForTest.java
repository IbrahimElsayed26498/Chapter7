/*
In the name of allah, the Gracious, the Merciful
 */
package enhancedfortest;

/**
 *
 * @author ibrahim
 */
public class EnhancedForTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        
        for (int number : array)
            total += number;
        
        System.out.println("Total = "+total);
    }
    
}
