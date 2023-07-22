import javax.swing.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {

    // Number Of Rows And Columns
    private static final int ROW = 70;
    private static final int COL = 70;
    private static final int CELL_SIZE = 10;

    private static Random rand = new Random();

    /** Function fills received arguments, according to random boolean
     * generated by "rand"
     */
    private static void initializeCells(Thread[][] cells, boolean[][] grid){

        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){

                grid[i][j] = rand.nextBoolean();
                // Filling of cells is not implemented yet
            }
        }
    }

    public static void main(String[] args) {

        boolean[][] grid = new boolean[ROW][COL];
        Thread[][] cells = new Thread[ROW][COL];

        initializeCells(cells, grid);

        JFrame frame = new ApplicationFrame(grid, ROW, COL, CELL_SIZE);
    }
}
