public class FakeConditinals 
{
public static void main(String[] argv){}
public static int f1(int a, int b, int c){
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
        c = 0;} 
    if ((a == 0 && b == 0)&& c== 0){
        return -1;
    }
    else {
        return Math.max(Math.max(a,b),c);
    }
}

public static boolean f2(int q, int x, int c){
    int hi = Math.max(Math.max(q,x), c);
    int my = Math.min(Math.min(q,x), c);
    int lol = (q + x + c)- hi - my;
    if (Math.pow(my,2)+Math.pow(lol,2) == Math.pow(hi,2)){
        return true;
    }
    else {
        return false;
    }
}

public static boolean f3(String c, String C){
    boolean pain = false;
    if(c.contains(C)){
        int hello = c.indexOf(C);
        String hell = c.substring(hello);
        if(hell.contains(C)){
            int heaven = hell.indexOf(C)+1;
            hell = hell.substring(heaven);
            if(hell.contains(C)){
                int midGard = hell.indexOf(C)+2;
                String thor = hell.substring(midGard);
                if(thor.contains(C)){
                    if(thor!=hell){
                        pain = true;
                        return pain;
                    }
                }
            }
        }
    }
    return pain; 
}

public static String f4(String foR, String teeMo){
    int death = foR.indexOf(teeMo);
    String e21 = foR.substring(0,death);
    String e12 = foR.substring(death+1);
    if (e21.length() == e12.length()){
        return e12+e21;
    }
    else if (e21.length()>e12.length()){
        return e21;
    }
    else {
        return e12;
    }
}

public static boolean f5(int s2, int s1, int s3){
    int mid = Math.max(Math.max(s2,s1), s3);
    int max = Math.min(Math.min(s1,s2), s3);
    int min = (s1 + s2 + s3)- max -mid;
    if (min + max >= mid){
        return true;
    }
    else{
        return false;
    
}

}
}
