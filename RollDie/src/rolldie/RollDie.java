/*
In the name of Allah, the Gracious, the Merciful
 */
package rolldie;

import java.security.SecureRandom;

/**
 *
 * @author ibrahim
 */
public class RollDie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] frequency = new int [7];
        
        SecureRandom randomNumber = new SecureRandom();
        
        for(int roll=0;roll<6000000;roll++)
            ++frequency[1+randomNumber.nextInt(6)];
        
        System.out.printf("%s%10s%n","face","frequency");
        
        for(int face=1;face<frequency.length;face++)
            System.out.printf("%4d%10d%n",face,frequency[face]);
        
        int total=0;
        for(int i=0;i<frequency.length;i++){
            total+=frequency[i];
        }
        System.out.println("totla = "+total);
        System.out.println(frequency[0]);
        
    }
    
}
