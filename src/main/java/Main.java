
public class Main {

    public static void main(String[] args) {

        int width = 8;
        int height = 8;

        int[][] grid = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] += 0;
            }
        }

        grid[2][3] = 1;


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
