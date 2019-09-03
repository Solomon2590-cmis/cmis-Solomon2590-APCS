
public class CastingAndOverlaodingPractive
{
    public static int oneOrZero(){
        return (int)(Math.random()*2); 
}
    public static int zeroTo99(){
        return (int)(Math.random()*100);
}
//    public static double zeroTo99(){
//      double rand = Math.random();
//      double multi = rand*100;
//      return multi;
//}
// cannot have same method but with same parameter
    public static int zeroToN(int n){
        return (int)(Math.random()*n);
}
    public static double zeroToN(double n){
        return Math.random()*n; 
}
    public static int minToMax(int min, int max){
        return (int)((max-min)+min*Math.random());
}
    public static double minToMax(double min, double max){
        return (max-min)+min*Math.random();
}
}
