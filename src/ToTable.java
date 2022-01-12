import java.util.Arrays;

public class ToTable {

    private int[] data;
    private int x,y;

    public ToTable(int[] data, int x, int y) {
        this.data = Arrays.copyOf(data,data.length);
        this.x = x;
        this.y = y;
    }

    public int[][] resize(){
        int [][] array = new int[x][y];
        for (int i = 0, k = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = data[i+j+k];
            }
            k++;
        }
        return array;
    }
}
