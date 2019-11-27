
/**
 * Write a description of class WhileLoopProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoopProblems
{
    public static void squareTable(){
        int a = 1;
        while (a<=10){
            System.out.print(a+"\t");
            System.out.print(a*a + "\t");
            System.out.println((int)(Math.random()*(Math.pow(a,2)-a)+1+a));
                        a++;
        }
        }
    public static int triangleNumber(int num){
        int retun = 0 ;
        while(num >=1){
            retun += num;
            num--;
        }
        return retun;
    }
     public static int pyramid(int num){
        int retun = 0 ;
        while(num >=1){
            retun += num*num;
            num--;
        }
        return retun;
    }
    public static void hi(){
            System.out.print("\t");
    }

}
