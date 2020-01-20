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
}
