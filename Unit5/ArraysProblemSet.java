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
}
