//In the name of Allah, the Gracious, the Merciful
package initarray;

import java.security.SecureRandom;

/**
 *
 * @author ibrahim
 */
public class InitArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        /*final int ARRAY_LENGTH = 10;
        int sumOfArray=0;
        int [] array = new int[ARRAY_LENGTH];
        //SecureRandom randomNumber = new SecureRandom();
        System.out.printf("%-6s%-8s%n","Index","Value");
        for (int counter = 0; counter<array.length; counter++){
            array[counter] = 2+2*counter;
            sumOfArray += array[counter]; 
            System.out.printf("%-6d%-8d%n",counter,array[counter]);
        }
        System.out.println("The of Array's element : " + sumOfArray);*/
        for(int i=0;i<10;i++){
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("");
    }
    
}
