/*
In the name  of Allah, the Gracious, the Merciful
 */
/*
the summrize of this program is that:
Jave does not allow primatve-type (like int, double ....) to be passed by reference
it's always passed by vale.

Arrays are Objects.

Passing array by value (i.e. to copy all elements in another array) will waste time and memory
so, it passes the refernce (just copping refernce = adress).
so, if you changes in the value of which the new refernce point to, it'll effect at the 
the origional refernce (or array)
but if you changes one of the two reference (specially the second) it will not effect the 
data itself (like if you made the second point to null, there is the first reference pointiong 
to the object at the memory)

Alhamdullilah.
*/
package passarray;

/**
 *
 * @author ibrahim
 */
public class PassArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        
        System.out.printf("Effects of passing reference to entire array:%n"+
                "The value of the orrigional array are:%n");
        
        for(int value : array)
            System.out.printf("   %d",value);
        
        modifyArray(array);
        System.out.printf("%nThe value of the mdified array are:%n");
        
        for(int value : array)
            System.out.printf("   %d",value);
        
        System.out.printf("%nEffects of passing array element value:%n"
        +"arra[3] before modifyElement:%d%n",array[3]);
        
        modifyElement(array[3]);
        
        System.out.printf("array[3] after modify element:%d%n",array[3]);
        
    }

    private static void modifyArray(int[] array2) {
        for(int counter=0; counter < array2.length; counter++)
            array2[counter] *= 2;
    }

    private static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifing element:%d%n",element);
    }
    
}
