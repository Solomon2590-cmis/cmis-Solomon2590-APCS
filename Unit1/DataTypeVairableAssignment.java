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
        double doublee = 1111111111.12312321234d;
        char character = '\ufead';
        boolean booleen = true; 
        String string = null;
        
        //APCS Variables
        boolean booleeen;
        int integeer;
        double doublea; 
        
        //Scanner for all
        //boolean booleanScanner = input.nextBoolean();
        //int integerScanner = input.nextInt();
        //double doubleScanner = input.nextDouble();
       
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
        System.out.format("I am a double:%.36f\nI am a boolean:%b",
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
         
         //double
         double sDouble1 = input.nextDouble();
         double sDouble2 = input.nextDouble();
         double addDouble = 1d + 2d;
         double differentDouble = 2d - 1d;
         double productDouble = 2d*2d;
         double quotientDouble = 1d/2d;
         
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
         int sumInt = inputInt + inputInt2;
         int differenceInt = inputInt - inputInt2;
         int productInt = inputInt * inputInt2;
         int quotientInt = inputInt / inputInt2;
         System.out.format("Operand1: %d\nOperand2: %d\nSum: %d\nDifference: %d\n",sumInt,differenceInt,productInt,quotientInt);
         
         //Scanner int double
         //int inputInt3 = input.nextInt();
         //double inputDouble = input.nextDouble();
         //Cannot put Double in Int
         //int sumIntDouble = inputInt3 + inputDouble;
         //int differenceIntDouble = inputInt3 - inputDouble;
         //int productIntDouble = inputInt3 * inputDouble;
         //int quotientIntDouble = inputInt3 / inputDouble;
         //System.out.format("Operand1: %d\nOperand2: %d\nSum: %d\nDifference: %d\n Product: %d\nQuotient: %d\n",sumIntDouble,differenceIntDouble,productIntDouble,quotientIntDouble);
         
         //Scanner Double int
         int inputInt3 = input.nextInt();
         double inputDouble = input.nextDouble();
         double sumIntDouble = inputInt3 + inputDouble;
         double differenceIntDouble = inputInt3 - inputDouble;
         double productIntDouble = inputInt3 * inputDouble;
         double quotientIntDouble = inputInt3 / inputDouble;
         
    }
}
