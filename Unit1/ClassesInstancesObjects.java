
public class ClassesInstancesObjects
{public static String binMaxInt(){
    return Integer.toBinaryString(Integer.MAX_VALUE);
}   
public static String binDiffMax(Integer i){
    return Integer.toBinaryString(Integer.MAX_VALUE-i);
}
public static String mutant(String a, String b){;
    int halflengtha = a.length()/2;
    int halflengthb = b.length()/2;;
    String firsthalfstr = a.substring(0,halflengtha);
    String secondhalfstr = b.substring(halflengthb);
    return firsthalfstr + secondhalfstr;
}
public static String triMutant(String a, String b, String c)
}
