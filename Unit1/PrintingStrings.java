import java.util.Scanner; 
/**
 * Write a description of class PrintingStrings here.
 *
 * @author (Solomon)
 * @version (0.1)
 */
public class PrintingStrings
{
    public static void main(String[] agrv){
        //Scanner is type of the variable
        //System.in is where the input is going to be from
        Scanner input = new Scanner(System.in);
        //input.nextLine is telling the computer to wait for your input
        String inputTest = input.nextLine();
        
        System.out.format("Hello: %s\n", inputTest); 
        
        System.out.println("Hello world");
        System.out.println("I am Handsome");
        
        //string literal
        String thisIsString = "Haha"; 
        //string instance 
        String anotherString = new String("Another haha"); 
        
        System.out.print(thisIsString + "\n");
        System.out.println(anotherString);
        
        //declaration 
        String myName;
        //definitin 
        myName = "Solomon";
        
        String error;
        error = "there's nothing to change";
        
        Integer itIsInteger = new Integer(2590);
        System.out.print(itIsInteger);
        System.out.print("change something");
    }
}