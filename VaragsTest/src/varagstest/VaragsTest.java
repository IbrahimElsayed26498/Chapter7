//In the name of Allah, the Gracious, the Merciful
package varagstest;

/**
 *
 * @author ibrahim
 */
public class VaragsTest {

    public static double average(double...numbers){
        double total = 0.0;
        for(double d : numbers)
            total += d;
        return total/numbers.length;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d1 = 10, d2 = 20, d3 = 30, d4 = 40;
        
        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n",d1,d2,d3,d4);
        
        System.out.printf("Average of d1 & d2 is : %.1f%n",average(d1,d2));
        System.out.printf("Average of d1 & d2 & d3 is : %.1f%n",average(d1,d2,d3));
        System.out.printf("Average of d1 & d2 & d3 &d4 is : %.1f%n",average(d1,d2,d3,d4));
    }
    
}
