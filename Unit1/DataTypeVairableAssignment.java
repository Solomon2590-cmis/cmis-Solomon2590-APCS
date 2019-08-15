import java.util.Scanner;
/**
 * Write a description of class DataTypeVairableAssignment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeVairableAssignment
{
    public static void main(String[] agrv){
        Scanner input = new Scanner(System.in);
        System.out.println("Datatypevariableassignment");
        
        System.out.println("ineger");
        int in = input.nextInt();
        System.out.println("String");
        String stringinput = input.nextLine();
        System.out.println("double");
        double doubleinput = input.nextDouble();
        System.out.println("long");
        long longinput = input.nextLong();
        
        short s = 0b11111111;
        System.out.println(s);
        char c = 0b11111111;
        System.out.println(c);
    }
}
