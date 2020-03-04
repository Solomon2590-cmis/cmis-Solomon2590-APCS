public class GameOfLife
{
    /*
     * Game Of Life Rules
     * 1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
     * 2. Any live cell with two or three live neighbours lives on to the next generation.
     * 3. Any live cell with more than three live neighbours dies, as if by over-population.
     * 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
     */
    public static void main(String[] argv){
    
    }   
    public static int near(int[][] board, int col, int row, int near){
        if(board[col][row] == 1){
            near++;
        }
        return near;
    }
    public static int[][] nextGeneration(int[][] board){
        int near = 0;
        int[][] nexG = new int[board.length][board[0].length];
        for(int col = 0; col < board.length; col++){
            for(int row = 0; row < board[0].length; row++){
                for(int compareWhich = 0; compareWhich<8; compareWhich++){
                    if(compareWhich == 0 && (col-1!=-1 && row-1!=-1)){
                        near(board, col-1, row-1, near);
                        }
                    else if(compareWhich == 1 && (col-1!=-1)){
                        near
                    }
                    }
                }
            }
       }
       }
