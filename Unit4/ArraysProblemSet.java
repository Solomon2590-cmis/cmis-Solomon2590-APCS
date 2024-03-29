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
public static int[] interleave(int[] array1, int[] array2){
    int[] re = new int[(array1.length)+(array2.length)];
    int which = 0;
    int ar1 = 0;
    int ar2 = 0;
    for( int i = 0; i < (array1.length+array2.length); i++){
        if(which % 2 == 0){
            if(ar1 >= array1.length){
                re[i] = array2[ar2];
                ar2++;
                which++;
            }
            else{
            re[i] = array1[ar1];
            ar1++;
            which++;
        }
        }
        else if(which % 2 == 1){
            if(ar2 >= array2.length){
                re[i] = array1[ar1];
                ar1++;
                which++;
            }
            re[i] = array2[ar2];
            ar2++;
            which++;
        }
    }
    return re; 
}
public static int[]maxValues(int[] array1, int[] array2){
    int[] re = new int[Math.max(array1.length,array2.length)];
    int len1 = 0;
    int len2 = 0;
    for(int i = 0; i < Math.max(array1.length,array2.length); i++){
        if( i > array1.length-1){
             re[i] =array2[len2];
             len2++;
        }
        else if( i > array2.length-1){
            re[i] = array1[len1];
            len1++;
        }
        else{
            re[i] = Math.max(array1[len1],array2[len2]);
            len1++;
            len2++;
        }
    }
    return re;
}
public static boolean allUnique(int[] array){
    boolean re = true;
    int arynum = 0;
    int going = 0;
    for(; arynum < array.length; arynum++){
        for(; going < arynum; going++){
            if(array[arynum] == array[going]){
                re = false;
            }
            
        }
        going = 0;
    }
    return re;
}
public static int[] uniqueValues(int[] array){
    int arynum = 0;
    int going = 0;
    int[] unitNum = new int[array.length];
    int unitNumN = 0;
    boolean uniqueOrNot = true;
    int sub = 0;
    int first = 0;
    for(;arynum < array.length; arynum++){
        if( array[arynum] == 0 && first == 0){
            unitNum[unitNumN] = arynum;
            unitNumN++;
            arynum = array.length;
            first++;
        }
        else if( array[arynum] == 0 && first == 1){
            arynum = array.length;
        }
    }
    arynum = 0;
    for(; arynum< array.length; arynum++){
        for(; going < array.length; going++){
            if(array[arynum] == array[going]){
                if(arynum != going){
                   array[going] = 0;
                }
                if(array[arynum] == 0){
                    uniqueOrNot = false;
                }
            }
        }
      
        if(uniqueOrNot == true){
                unitNum[unitNumN] = arynum;
                unitNumN++;
        }
        uniqueOrNot = true;
        going = 0;
    }   
    int[] re = new int[unitNumN];
    int which = 0;
    for(int i = 0; i < unitNumN; i++){
        re[i] = array[unitNum[which]];
        which++;
    }
    return re;
    }
public static int[] randomArray(int length, int min, int max){
     int[] re = new int[length];
     int ran = 0;
     for(int i = 0; i < length; i++){
         re[i] = ((int)(Math.random()*max-1))+min;
        }
        return re;
    }
    public static void bubbleSort(int[] array){
        int[] result = new int[array.length];
        int box;
        for(int i = 0; i < array.length; i++){
            int idx = 0;
            for(; idx < array.length -1; idx++){
                if (array[idx] > array[idx+1]){
                    box = array[idx];
                    array[idx] = array[idx+1];
                    array[idx+1] = box;
                }
                result[idx] = array[idx];
                result[idx+1] = array[idx+1];
            }  
        }
} 
public static String out(int[] array){
        String ii = "";
        for(int i = 0; i < array.length; i++){
            ii += array[i]+",";
        }
        System.out.println(ii);
        return ii;
}
public static int linearSearch(int[] haystack, int needle){
    int re = -1;
    for(int i = 0; i < haystack.length; i++){
        if(haystack[i] == needle){
            re = i;
            i = haystack.length;
        }
    }
    return re; 
}
public static int binarySearch(int[] haystack, int needle){
    ArraysProblemSet.bubbleSort(haystack);
    int compareInt = (haystack.length-1)/2;
    int re = -1;
    int length = haystack.length-1;
    System.out.print(compareInt);
    while(length != 1){
        int[] newArray = new int[compareInt+1];
        if(haystack[compareInt] == needle || newArray[compareInt] == needle){
                re = compareInt;
                length = 1;
            }
        else if(haystack[compareInt] > needle || newArray[compareInt] > needle){
            for(int i = 0; i < newArray.length; i++){
                newArray[i] = haystack[i];
                }
            length = newArray.length;
            compareInt = (newArray.length-1)/2;
        }
        
        else if(haystack[compareInt] < needle || newArray[compareInt] < needle){
            int goingBack = newArray.length-1;
               for(int i = 0; i < newArray.length; i++){
                newArray[i] = haystack[goingBack];
                goingBack--;
            }
            length = newArray.length;
            compareInt = (newArray.length-1)/2;
        }
        }
    
    return re;
}
}
