public class ArraysProblemSet
{
public static int max(int[] array){
    int len = array.length;
    System.out.print(len);
    int round = 0 ;
    int greater = 0;
    while(round < len){
        greater = Math.max(array[round],greater);
        round++;
    }
    return greater;
}
public static int minIdx(int[] array){
    int len = array.length;
    int bit = array[0];
    int re = 0;
    for(int lenn = 1; lenn < len; lenn++){
        if(Math.min(array[lenn],bit)==array[lenn]){
            bit = array[lenn];
            re = lenn;
        }
    }
    return re;
}
public static int sum(int[] array){
    int re = 0;
    for(int i = 0; i < array.length; i++){
        re += array[i];
    }
    return re;
}
public static double avg(int[] array){
    int re = 0;
    for(int i = 0; i < array.length; i++){
        re += array[i];
    }
    re = re/(array.length);
    return re;
}
public static boolean allGreater(int[] array,int threshold){
    boolean re = true;
    for(int i = 0; i < array.length; i++){
        if(array[i]>threshold){
            re = false;
        }
    }
    return re; 
}
public static boolean oneGreater(int[] array,int threshold){
    boolean re = false;
    int hi = 0;
    for(int i = 0; i < array.length; i++){
        if(array[i]>threshold && hi == 0){
            re = true;
            hi++;
        }
        if(array[i]>threshold && hi ==1){
            re = false;
        }
    }
    return re; 
}
public static int sumOfLessThan(int[] array, int threshold){
    int re = 0;
    for(int i = 0; i < array.length; i++){
        if(array[i]<threshold){
            re += array[i];
        }
    }
    return re;
}
public static int greatestPairIdx(int[] array){
    int re = 0;
    int gsum = 0;
    for(int i = 0; i < array.length-1; i++){
        gsum = Math.max(gsum,array[i]+array[i+1]);
        if(gsum == array[i]+array[i+1]){
            re = i;
        }
    }
    return re; 
}
public static int[] reverse(int[] array){
    int[] reverse;
    reverse = new int[array.length];
    int reversenum = 0;
    for(int i = (array.length)-1; i >= 0; i--){
        reverse[reversenum] = array[i];
        reversenum++;
    }
    return reverse;
}
public static int[] shiftLeft(int[] array, int distance){
    int[] re = new int[array.length];
    int index = 0;
    int addedval = 0;
    for(int i = 0; i < array.length; i++){
        if( i+distance > array.length-1){
            addedval = i+distance- ((array.length));
            re[i] = array[addedval];
        }
        else{
            re[i] = array[i+distance];
        }
    }
    return re;
}
public static int[] sifthRIght(int[] array, int distance){
     int[] re = new int[array.length];
    int index = 0;
    int addedval = 0;
    for(int i = (array.length)-1; i >= 0; i--){{
        if(i-distance < 0){
            addedval = i-distance + array.length;
            re[i] = array[addedval];
        }
        else{
            re[i] = array[i-distance];
        }
    }
    }
    return re;
}
}

