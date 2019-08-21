
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mathoperations
{
    public static int sum(int a, int b, int c){
        return a+b+c; 
    }
    public static double avg(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static double volumeCylinder(double diameter, double height){
        return Math.PI*Math.pow(diameter/2,2)*height; 
    }
}
