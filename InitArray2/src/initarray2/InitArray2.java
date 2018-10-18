/*
In the name of Allah, the Gracious, the Merciful
 */
package initarray2;

/**
 *
 * @author ibrahim
 */
public class InitArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 3 )
            System.out.printf("Error: Please re-enter the entire command, including%n"
            +"and array size, intial value and increment.%n");
        else{
            int arrayLength = Integer.parseInt(args[0]);
            int [] array = new int [arrayLength];
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            
            for(int counter = 0; counter < array.length; counter ++ ){
                array[counter] = initialValue + increment*counter;
            }
            System.out.printf("%s%8s%n","Index","Value");
            
            for(int counter =0; counter<array.length; counter ++)
                System.out.printf("%5d%8d%n0",counter,array[counter]);
        }
    }
    
}
