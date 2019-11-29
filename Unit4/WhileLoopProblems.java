
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
    public static String multiplicationTable (int a, int b){
            String retrn = " \t";
            int x = 1;
            int y = 1;
            int sum = 0;
            while (x <= a){
                retrn += x + "\t";
                x++;
            }
            retrn += "\n";
            x= 1;
            int z = 1;
            while (y <= b){
                retrn += x + "\t";
                while ( z <= a ){
                    sum = z * y;
                    retrn += sum + "\t";
                    z++;
                }
                retrn += "\n";
                z = 1;
                x++; 
                y++;
            }
            System.out.print(retrn);
            return retrn;
        }
    public static void checkerboard(int h, int w){
     int realww = 1;
     String dash = "";
     while (realww <= w){
         dash += "-";
         realww++;
        }
     String updown = "+"+dash+"+"+"\n";
     int realh = 0;
     String space = "";
     int realw = 0;
     String out = "";
     String rightleft;
     while (realh < h){
          space = "";
          realw = 0;
        }
     while (realw < w){
         if (realh % 2 == 0 && realw%2 == 0){
          space += "#";
          realw += 1;
        }
        else if (realh % 2 == 0 && realw%2 == 1){
          space += " ";
          realw += 1;
        }
        else if (realh % 2 == 1 && realw%2 == 0){
          space += " ";
          realw += 1;
        }
        else if (realh % 2 == 1 && realw%2 == 1){
          space += "#";
          realw += 1;
        }
        realh += 1  ;
        rightleft = "|"+space+"|"+"\n";
        out += rightleft;
      }
     String addup = updown + out + updown;
     System.out.print(addup); 
    }
}
