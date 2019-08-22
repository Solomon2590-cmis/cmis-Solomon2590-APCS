
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
    public static int numberOfSides(int inAngle){
        int negativeAngle = inAngle * -1;
        return 360/(negativeAngle+180);
    }
    public static int interestingNumb(int x, int y){
        int originalx = x;
        int originaly = y;
        x*=3;
        y*=3;
        x+=9;
        y+=9;
        x/=3;
        y/=3;
        x-=originalx;
        y-=originaly;
        return (x+y)*4; 
    }
    public static double surfaceAreaClyinder(double radius, double height){
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }
}
