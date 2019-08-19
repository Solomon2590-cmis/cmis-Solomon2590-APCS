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
        
        //System.out.println("ineger");
        //int in = input.nextInt();
        //System.out.println("String");
        //String stringinput = input.nextLine();
        //System.out.println("double");
        //double doubleinput = input.nextDouble();
        //System.out.println("long");
        //long longinput = input.nextLong();
        
        //all primitive data
        byte bite = 123; 
        int integer = 1;
        long longg = 123123L;
        short shortt = 234;
        float floatt = 1.123f;
        double doublee = 1.12312321234d;
        char character = '\ufead';
        boolean booleen = true; 
        String string = null;
        
        //APCS Variables
        boolean booleeen;
        int integeer;
        double doublea; 
        
        //Scanner for all
        boolean booleanScanner = input.nextBoolean();
        int integerScanner = input.nextInt();
        double doubleScanner = input.nextDouble();
       
        //Print out primitive data 
        System.out.println(bite);
        System.out.println(integer);
        System.out.println(longg);
        System.out.println(shortt);
        System.out.println(floatt);
        System.out.println(doublee);
        System.out.println(character);
        System.out.println(booleen);
        System.out.println(string);
        
        //Using format to print AP data
        System.out.format(
        "I am an integer:%d\nI am a double:%f\nI am a boolean:%b",
        integer,
        doublee,
        booleen);
        
        short s = 0b11111111;
        System.out.println(s);
        char c = 0b11111111;
        System.out.println(c);
    }
    public static void typeTest(){
         //integer
         Scanner input = new Scanner(System.in);
         int sInteger1 = input.nextInt();
         int sInteger2 = input.nextInt();
         int addInteger = 1+2;
         int differentInteger = 2-1;
         int productInteger = 2*2;
         int quotientInteger = 1/2;
         System.out.format("Scanner1: %d\nScanner2: %d\nSum: %d\nDifference: %d\nProduct: %d\nQuotient:%d\n",sInteger1,sInteger2,addInteger,differentInteger,productInteger,quotientInteger);
         
         //double
         double sDouble1 = input.nextDouble();
         double sDouble2 = input.nextDouble();
         double addDouble = 1d + 2d;
         double differentDouble = 2d - 1d;
         double productDouble = 2d*2d;
         double quotientDouble = 1d/2d;
         System.out.format("Scanner1: %1.2f\nScanner2: %f\nSum: %f\nDifference: %f\nProduct: %f\nQuotient:%f\n",sDouble1,sDouble2,addDouble,differentDouble,productDouble,quotientDouble);
         
         //Scanner Double
         double ssDouble1 = input.nextDouble();
         double ssDouble2 = input.nextDouble();
         //int sumDouble12 = ssDouble1 + ssDouble2; Cannot convert double to int
         //int differenceDouble12 = ssDouble1 - ssDouble2; Cannot conver double to int
         //int productDouble12 = ssDouble1 * ssDouble2; Cannot convert double to int
         //int quotientDouble12 = ssDouble1/ssDouble2; Cannot convert double to int
         
         //Can convert int to double
         
         //Scanner int
         int inputInt = input.nextInt();
         int inputInt2 = input.nextInt();
         
    }
}

