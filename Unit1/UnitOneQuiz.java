public class UnitOneQuiz
{public static int sumOfSqaures(int a, int b){
    int powerA = a*a;
    int powerB = b*b;
    return powerA + powerB;
}
public static double squareOfSum(double a, double b){
    double sumA = a+b;
    return sumA*sumA;
}
public static double avg(int a, int b, int c){
    return ((double)a + (double)b + (double)c)/3;
}
public static double avgOfCubes(double a, double b, double c){
    double cubeA = a*a*a;
    double cubeB = b*b*b;
    double cubeC = c*c*c;
    return (cubeA + cubeB + cubeC)/3;
}
public static double cubeOfAvg(int a,int b, double c){
    double avg = ((double)a+(double)b+(double)c)/3;
    return avg*avg*avg;
}
public static int sum(double a, double b, double c){
    return (int)(a + b + c);
}
}