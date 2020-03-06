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
        int[][] board = {{0,1,1,0,0,0,0,0},
                         {0,0,1,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0}};
            
        System.out.println(printNextGen(nextGeneration(board)));
        int[][] b= nextGeneration(board);
        for(int i = 0; i < 20; i++){
            System.out.println(printNextGen(b));
            System.out.println(("____________________" + i));
            b = nextGeneration(b);
        }
    }   
    public static String printNextGen(int[][] board){
        String output = "";
        for(int col = 0; col < board.length; col++){
            for(int row = 0; row < board[0].length; row++){
                if(board[col][row] == 1){
                output+= board[col][row] + " ";
            }
                else{
                    output+= "  ";
                }
        }
            output+= "\n";
        }
        return output;
    }
    public static int nearl(int[][] board, int col, int row, int near){
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
                for(int compareWhich = 0; compareWhich < 8; compareWhich++){
                    if(compareWhich == 0 && (col-1!=-1 && row-1!=-1)){
                        near = nearl(board, col-1, row-1, near);
                        }
                    if(compareWhich == 1 && (col-1!=-1)){
                        near = nearl(board, col-1, row, near);
                    }
                    if(compareWhich == 2 && (col-1!=-1 && row+1!= board[0].length)){
                        near = nearl(board, col-1, row+1, near);
                    }
                    if(compareWhich == 3 && ( row-1 != -1)){
                        near = nearl(board, col, row-1, near);
                    }
                    if(compareWhich == 4 && (row+1 != board[0].length)){
                        near = nearl(board, col, row+1, near);
                    }
                    if(compareWhich == 5 && (col+1 != board.length && row-1 != -1)){
                        near = nearl(board, col+1, row-1, near);
                    }
                    if(compareWhich == 6 && (col+1 != board.length)){
                        near = nearl(board, col+1, row, near);
                    }
                    if(compareWhich == 7 && (col+1 != board.length && row+1 != board[0].length)){
                        near = nearl(board, col+1, row+1, near);
                    }
                    }
                if(near ==1&& board[col][row] == 1){
                    nexG[col][row] = 0;
                }
                else if(near > 1 && near < 4 && board[col][row] == 1){
                    nexG[col][row] = 1;
                }
                else if(near > 3&& board[col][row] == 1){
                    nexG[col][row] = 0;
                }
                else if(near == 3 && board[col][row] == 0){
                    nexG[col][row] = 1; 
                }
                near = 0;
            }
       }
       return nexG;
       }
    }
