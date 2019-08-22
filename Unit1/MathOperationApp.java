import java.util.Scanner;
public class MathOperationApp
{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Put in any two whole numbers and you will get 24");
        int parameter1 = input.nextInt();
        int parameter2 = input.nextInt();
        System.out.println(Mathoperations.interestingNumb(parameter1,parameter2));
        System.out.println("Put in radius and height and will return surface area of defined clyinder");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        System.out.println(Mathoperations.surfaceAreaClyinder(radius,height));
    }
}
