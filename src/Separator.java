import java.util.Arrays;
import java.util.Random;

public class Separator {

    static final int DEFAULT_N = 10;
    final Random random = new Random();

    private int[] array;
    private int n;


    public Separator(int[] array, int n) {
        this.n = n;
        this.array = Arrays.copyOf(array, n);
    }

    public Separator(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public Separator(int n) {
        this.n = n;
        this.array = new int[n];
        for (int i = 0; i < n; i++) {
            this.array[i] = random.nextInt(100);
        }
    }

    public int[] even() {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenCount++;
        }
        int[] evenArray = new int[evenCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            }
        }
        return evenArray;
    }

    public int[] odd() {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                oddCount++;
        }
        int[] oddArray = new int[oddCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[j] = array[i];
                j++;
            }
        }
        return oddArray;
    }
}
