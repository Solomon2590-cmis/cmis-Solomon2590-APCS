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
     int randNum = (int)(Math.random()*10);
     int randX = (int)(Math.random()*(w)); 
     int randY = (int)(Math.random()*(h));
     System.out.println(randX);
     System.out.println(randY);
     if ((randY % 2 == 0 && randX % 2 == 1)&& randX ==w){
         randX -= 1;
        }
        
     else if ((randY % 2 == 0 && randX % 2 == 1)&& randX <= 0){
         randX += 1;
        }
     else if (randY % 2 == 0 && randX % 2 == 1){
         if(Math.random()>=0.5){
             randX += 1;
            }
         else {
             randX -= 1;
            }
        }
     else if (randY % 2 == 1 && randX %2 == 0){
         if(Math.random()>=0.5){
             randX += 1;
            }
         else {
             randX -= 1;
            }
        }

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
     while (realw < w){
          if (realh % 2 == 0 && realw%2 == 0){
                  if(randX == realw && randY == realh){
                     space += randNum; 
                     realw +=1;
                    }
                   else{
                  space += "#";
                  realw += 1;
                }
                }
          else if (realh % 2 == 0 && realw%2 == 1){
                  if(randX == realw && randY == realh){
                     space += randNum;
                     realw += 1;
                    }
                   else{
                  space += " ";
                  realw += 1;
                }
            }
          else if (realh % 2 == 1 && realw%2 == 0){
                  if(randX == realw && randY == realh){
                     space += randNum;
                     realw += 1;
                    }
                   else{
                  space += " ";
                  realw += 1;
                }
            }
               
          else if (realh % 2 == 1 && realw%2 == 1){
                  if(randX == realw && randY == realh){
                     space += randNum;
                     realw += 1;
                     }
                  else{
                      space += "#";
                      realw += 1;
                }
            }

        }
        rightleft = "|"+space+"|"+"\n";
        realh++;
        out += rightleft;
    
}
            String addup = "\n"+updown + out + updown;
            System.out.print(addup);
}
}