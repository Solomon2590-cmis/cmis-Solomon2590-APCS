
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
            for(int rowss = 0; rowss < rows; rowss++){
            if (operation == 0){
                out += (columnss + rowss)+ "\t";
            }
            else if (operation == 1){
                out += (columnss - rowss) + "\t";
            }
            else if (operation == 2){
                out += (columnss * rowss) + "\t";
            }
            else if (operation == 3){
                if ( rowss == 0){
                    out += "error\t";
                }
                else{
                    out += (columnss / rowss) + "\t";
                }
            }
            else if (operation == 4){
                out += Math.pow(columnss, rowss) + "\t";
            }
            else {
                return "error";
            }
        }
        out += "\n";
    }
     System.out.println(out);
    return out;
}
public static String map(int height, int width, String symbols){
    String out = "";
    for (int heightt = 0; heightt < height; heightt++){
        for (int widthh = 0; widthh < width; widthh++){
            int ran = ((int)(Math.random() * symbols.length()));
            out += symbols.substring(ran, ran +1) + "\t";
        }
        out += "\n";
    }
    System.out.println(out);
    return out;
}
public static String readMap(int x, int y, String map){
    String out = "";
    int height = (int)(Math.random()*10);
    int width = (int)(Math.random()*10);
    String symbols = "!@#$";
    if (x > width && y > height){
        return "error";
    }
    else{
    for (int heightt = 0; heightt < height; heightt++){
        for (int widthh = 0; widthh < width; widthh++){
            int ran = ((int)(Math.random() * symbols.length()));
            out += symbols.substring(ran, ran +1);
            if (x == widthh && y == heightt){
                 String redo = out.substring(out.length());
            }
        }
        out += "\n";
    }
        System.out.println(out);
        return redo;
    }
}}
