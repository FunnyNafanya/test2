public class ToLine {

    private int data[][];

    public ToLine(int[][] data) {
        this.data = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public int[] resize() {
        int n = data.length * data[0].length;
        int[] array = new int[n];
        for (int i = 0, k = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                array[i+j+k] = data[i][j];
            }
            k++;
        }
        return array;
    }
}
