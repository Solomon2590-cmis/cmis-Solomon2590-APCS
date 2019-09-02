
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
        double multimini = rand * min;
        double multimax = rand * max;
        int mini = (int)multimini;
        int maxi = (int)multimax;
        return maxi-mini;
}
    public static double minToMax(double min, double max){
        double rand = Math.random();
        double difference = max-min;
        double re = rand * difference; 
        return re;
}
}
