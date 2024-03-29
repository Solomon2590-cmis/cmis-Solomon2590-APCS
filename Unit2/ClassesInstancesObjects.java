
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
public static String triMutant(String a, String b, String c){
    int onethird1 = a.length()/3;
    int onethird2 = b.length()/3;
    int onethird3 = c.length()/3;
    String firstThird = a.substring(0,onethird1);
    String secondThird = b.substring(onethird2,onethird2*2);
    String thirdThird = c.substring(onethird3,onethird3*2);
    return firstThird + secondThird + thirdThird;
}
public static int indexOf2nd(String haystack, String needle){
    Integer firstOccurrence = new Integer(haystack.indexOf(needle));
    Integer secondOccurrence = new Integer(haystack.indexOf(needle, firstOccurrence + 1));
    return secondOccurrence;
}
public static int indexOf2ndLast(String haystack, String needle){
    Integer lastOccurrence = new Integer(haystack.lastIndexOf(needle));
    Integer secondLast = new Integer(haystack.lastIndexOf(needle, lastOccurrence - 1));
    return secondLast;
}
public static boolean reduplication(String word){
    int longString = word.length()/2;
    String firsthalf = word.substring(0,longString);
    return firsthalf.equals(word.substring(longString));
}
public static boolean binContains(Integer i, String p){
    return (Integer.toBinaryString(i)).contains(p);
}
public static boolean isPalidrome(Integer i){
    int bit = Integer.reverse(i);
    return i.equals(bit);
}
public static boolean isAnagram(Integer a, Integer b){
    int aOnes = Integer.bitCount(a);
    int bOnes = Integer.bitCount(b);
    String aOnesString = Integer.toString(aOnes);
    String bOnesString = Integer.toString(bOnes);
    return aOnesString.equals(bOnesString);
}
public static boolean cubeContainsSelf(Integer i){
    int cube = i*i*i;
    String re = Integer.toString(cube);
    String rex = Integer.toString(i);
    return re.contains(rex);
}
public static Double maxValue(Double a, Double b, Double c, Double d){
    double re;
    double rex;
    re = Math.max(a,b);
    rex = Math.max(c,d);
    return Math.max(re,rex);
}
public static Integer middleValue(Integer a, Integer b, Integer c){
    return (a+b+c) - Math.min(Math.min(a,b),c) - Math.max(Math.max(a,b),c);
}
}
