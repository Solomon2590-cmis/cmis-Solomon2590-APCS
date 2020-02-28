import java.util.*;
public class ArrayListProblem
{
     public static void main(String[] argv){
         insertAvgs(integerList(6.0));
         System.out.println(integerList(6.0));
    }
    
    public static ArrayList<Double> integerList(double len){
        ArrayList<Double> al = new ArrayList<Double>((int)len);
        for(Double i = 0.0; i < len; i ++){
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
    
    public static ArrayList<Double> insertAvgs(ArrayList<Double> al){
        int len = al.size();
        for(int idx = 0; idx < 2*len -2;idx+=2){
                al.add(idx+1,(al.get(idx) + al.get(idx+1))/2);
        }
        return al;
    }

    public static List<String> chopper(List<String> words){
        List<String> re = new ArrayList<String>();
        String in = "";
        int len;
        for(int i = 0; i < words.size(); i++){
            if(i+1 == words.size()){
                len =(words.get(i)).length();
                re.add(i,(re.get(i).substring(0,len/2))+(re.get(0).substring(len/2,len)));
            }
            else{
                len =(words.get(i)).length();
                re.add(i,(re.get(i).substring(0,len/2))+(re.get(i+1).substring(len/2,len)));
            }
        }
        return re;
    }

    }
