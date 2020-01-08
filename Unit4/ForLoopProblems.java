
/**
 * Write a description of class ForLoopProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoopProblems
{
    public static String table(int rows, int columns, int operation){
        String out = "";
        for(int columnss = 0; columnss < columns; columnss++) {
            for(int rowss = 0; rowss < rows; rows++){
            if (operation == 0){
                out += columnss+rowss+"\t";
                
            }
            }
        }
}
}