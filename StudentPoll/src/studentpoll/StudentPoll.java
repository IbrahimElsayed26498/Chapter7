/*
In the name of Allah, the Gracious, the Merciful
 */
package studentpoll;

/**
 *
 * @author ibrahim
 */
public class StudentPoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];
        for (int answer = 1; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("responses[%d] = %d%n", answer, responses[answer]);
            }
        }
        System.out.printf("%6s%10s%n", "Rating", "Frequency");

        //output each array element value
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }

    }

}
