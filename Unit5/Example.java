import java.util.*;
public class Example
{
    public static void main(String[] argv){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            numbers.add(0,i);
        }
        System.out.print(numbers);
}
}
