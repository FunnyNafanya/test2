public class LimitingRectangle {

    static final int NUMBER_OF_COORDINATES = 2;

    private int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = new int[points.length][NUMBER_OF_COORDINATES];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < NUMBER_OF_COORDINATES; j++) {
                this.points[i][j] = points[i][j];
            }
        }
    }

    public String getBorders() {
        return getMinY() + ", " + getMaxY() + ", " + getMinX() + ", " + getMaxX();
    }

    public int getHeight() {
        return getMaxY() - getMinY();
    }

    public int getWidth() {
        return getMaxX() - getMinX();
    }

    int getMinX() {
        int minX = points[0][0];
        for (int i = 1; i < points.length; i++)
            if (minX > points[i][0])
                minX = points[i][0];
        return minX;
    }

    int getMinY() {
        int minY = points[0][1];
        for (int i = 1; i < points.length; i++)
            if (minY > points[i][1])
                minY = points[i][1];
        return minY;
    }

    int getMaxX() {
        int maxX = points[0][0];
        for (int i = 1; i < points.length; i++)
            if (maxX < points[i][0])
                maxX = points[i][0];
        return maxX;
    }

    int getMaxY() {
        int maxY = points[0][1];
        for (int i = 1; i < points.length; i++)
            if (maxY < points[i][1])
                maxY = points[i][1];
        return maxY;
    }
}
