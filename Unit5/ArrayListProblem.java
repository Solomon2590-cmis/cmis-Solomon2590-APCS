import java.util.*;
public class ArrayListProblem
{
     public static void main(String[] argv){
         System.out.println(getOdds(integerList(5)));
    }
    
    public static List<Integer> integerList(int len){
        List<Integer> al = new ArrayList<Integer>(len);
        for(int i = 0; i < len; i ++){
            al.add(i);
        }
        return al;
    }
    
    
    public static List<Integer> getOdds(List<Integer> al){
        List<Integer> re = new ArrayList<Integer>();
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) != null && al.get(i) % 2 != 0  ){
                re.add(al.get(i));
                al.remove(i); 
            }
        }
        return re;
    }
    
    public static void insertAvgs(List<Double> al){
        int len = al.size();
        for(int i = 0; i < len; i++){
            
        }
    }
    
    //public static List<String> chopper(List<String> words){

    //}

    }
