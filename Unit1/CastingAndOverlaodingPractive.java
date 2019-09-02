
public class CastingAndOverlaodingPractive
{
    public static int oneOrZero(){
        double rand = Math.random(); 
        double mutirand = rand*2;
        int re = (int)mutirand; 
        return re; 
}
    public static int zeroTo99(){
        double rand = Math.random();
        double multi = rand*100;
        int re = (int)multi;
        return re;
}
//    public static double zeroTo99(){
//      double rand = Math.random();
//      double multi = rand*100;
//      return multi;
//}
// cannot have same method but with same parameter
    public static int zeroToN(int n){
        double rand = Math.random();
        double multi = rand*n;
        int re = (int)multi;
        return re;
}
    public static double zeroToN(double n){
        double rand = Math.random();
        double multi = rand*n;
        return multi; 
}
    public static int minToMax(int min, int max){
        double rand = Math.random();
        int mini = (max+min)/2;
        double re = (mini+min)*rand;
        int ree = (int)re;
        return ree;
}
    public static double minToMax(double min, double max){
        double rand = Math.random();
        double mini = (max+min)/2;
        double re = (mini+min)*rand;
        return re;
}
}
