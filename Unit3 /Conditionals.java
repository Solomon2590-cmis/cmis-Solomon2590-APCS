public class Conditionals
{
public static void main(String[] argv){}
/**
     * Return true if v is between low and high
     */
public static boolean between(int low, int high, int v){
    if (v > low && v < high){
        return true;
    }
    else {
        return false;
    }
}
/**
     * Return true if v is not between low and high
     */
public static boolean notBetween(int low, int high, int v){
    if (!(v > low && v < high)){
        return true;
    }
    else {
        return false;
    }
}
/**
     * Return the greatestEven number from a, b, and c
     */
public static int greatestEven(int a, int b, int c){
    if ((a == 0 && b == 0)&& c== 0){
        return 0;
    }
    if (a % 2 != 0){
        a = 0;
    }
    if (b % 2 != 0){
        b = 0;
    }
    if (c % 2 != 0){
        c = 0;
    }
    if ((a == 0 && b == 0)&& c== 0){
        return -1;
    }
    else {
        return Math.max(Math.max(a,b),c);
    }
}
/**
     * return true if v is a multiple of both a and b
     */
public static boolean isMultipleOf(int v, int a, int b){
    if (v % a == 0 && v % b == 0){
    return true;
}

    else {
        return false;
    }
}

    /**
     * return true if s1, s2, and s3 represent the length of the sides of a triangle.
     */
public static boolean isTriangle(int s1, int s2, int s3){
    int max = Math.max(Math.max(s1,s2), s3);
    int min = Math.min(Math.min(s1,s2), s3);
    int mid = (s1 + s2 + s3)- max -min;
    if (mid + min >= max){
        return true;
    }
    else{
        return false;
    }
}

    /**
     * return true if s1, s2, and s3 could possibly represent the lengths of the sides of an isoscelese triangle.
     */
public static boolean isIsoscelese(int s1, int s2, int s3){
    int max = Math.max(Math.max(s1,s2), s3);
    int min = Math.min(Math.min(s1,s2), s3);
    int mid = (s1 + s2 + s3)- max -min;
    if (mid + min >= max){
        return true;
    }
    else{
        return false;
    }
}

    /**
     * Return true if s1, s1, and s3 could represent the lengths of the sides of an equalateral triangle.
     */
public static boolean isEqualateral(int s1, int s2, int s3){
    if (s1 <= 0 || s2 <= 0 || s3<= 0){
        return false;
    }
    else if ( (s1 == s2) && (s1 == s3)){
        return true;
    }
    else {
        return false;
    }
}

/**
     * Return true if q, x, and c are a valid pythagorean triple (i.e. a^2 + b^2 = c^2)
     * Any combination of the three can make it valid, not necessarily in the order given.
     */
public static boolean isPythTrip(int q, int x, int c){
    int max = Math.max(Math.max(q,x), c);
    int min = Math.min(Math.min(q,x), c);
    int mid = (q + x + c)- max -min;
    if (Math.pow(min,2)+Math.pow(mid,2) == Math.pow(max,2)){
        return true;
    }
    else {
        return false;
    }
}

 /**
     * return true if word begins and ends with ps
     */
public static boolean isPrefixAndSuffix(String ps, String word){
    int first = word.indexOf(ps);
    int last = word.lastIndexOf(ps);
    if (first > -1 && last != first){
        return true;
    }
    else {
        return false;
    }
}

/**
     * split the word at character c.
     * return the shorter of the 2 strings on either side of the split.
     * if they are the same length concatenate them and return
     * example:
     * c -> "c"
     * word -> "racecar"
     * return value -> "ra"
     * 
     * c -> "e"
     * word -> "racecar"
     * return -> "raccar"
     * 
     * c -> "u"
     * word -> "computer"
     * return -> "ter"
     */
public static String shortSide(String word, String c){
    int index = word.indexOf(c);
    String sub1 = word.substring(0,index);
    String sub2 = word.substring(index+1);
    if (sub1.length() == sub2.length()){
        return sub1+sub2;
    }
    else if (sub1.length()>sub2.length()){
        return sub1;
    }
    else {
        return sub2;
    }
}

/**
     * return true if there are more than 3 occurances of c in the string word.
     * 
     * word -> "banana"
     * c -> "a"
     * return -> false
     * 
     * word -> "alabama"
     * c -> "a"
     * return -> true
     */
public static boolean tooMany(String word, String c){
    boolean pain = false;
    if(word.contains(c)){
        System.out.println("g1");
        int indexof = word.indexOf(c)+1;
        String index = word.substring(indexof);
        System.out.println(index);
        if(index.contains(c)){
            System.out.println("g2");
            int indexof1 = index.indexOf(c)+1;
            index = index.substring(indexof1);
            System.out.println(index);
            if(index.contains(c)){
                System.out.println("g3");
                int indexof2 = index.indexOf(c)+1;
                String index1 = index.substring(indexof2);
                System.out.println(index1);
                if(index1.contains(c)){
                    System.out.println("g4");
                    if(index1!=index){
                        pain = true;
                    }
                }
            }
        }
    }
    return pain;
}
public static int randNum(){
    return (int)(Math.random()*12);
}
}
