
import java.util.Arrays;

/**
 *
 * @author JAmes
 */
public class Selectionsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 23, 12, 654, 23, 5 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                    int temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        // TODO code application logic here
    }

}
