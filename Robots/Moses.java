import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Moses extends Robot
{
    public Moses(){
        super(Color.MAGENTA); //You can change the color
        //Color.RED, Color.BLUE, Color.GREEN, 
        //Color.YELLOW, Color.CYAN, Color.MAGENTA
    }
    
    public void init(){
        
    }
    
    /**
     * <p>
     * What your robot can do <em>once</em> per round:
     * </p>
     * <ul>
     * <li>right() => move 1 to the right</li>
     * <li>left() => move 1 to the left</li>
     * <li>up() => move 1 up</li>
     * <li>down() => move 1 down</li>
     * </ul>
     * <p>
     * What your robot can do <em<any number of times</em> per round:
     * </p>
     * <ul>
     * <li>isClearRight() => returns true if no block to the right</li>
     * <li>isClearLeft() => returns true if no block to the left</li>
     * <li>isClearUp() => returns true if no block up</li>
     * <li>isClearDown() => returns true if no block down</li>
     * <li>isStuck() => returns true if Robot hasn't change position</li>
     * <li>getData(int idx) => get a value from the array (there are 10 slots)</li>
     * <li>setData(int idx, int value) => replace a value in the array (there are 10 slots)</li>
     * <li>getX()<li>
     * <li>getY()<li>
     * <li>getOldX()<li>
     * <li>getOldY()<li>
     * </ul>
     */
    
    public void behave(){
    int x = getData(0);
    int y = getData(1);
    if (!isClearRight() == true && (!isClearUp() == true && !isClearDown() == true)){
           setData(2,getX());
           setData(3,getY());
           x = 1;
           y = 2;
          }   
    if (x <= y){
            if (Greenfoot.getRandomNumber(3) == 0){
                up();
            }
            else if (Greenfoot.getRandomNumber(3) == 1 ){
                down();
            }
            else if (Greenfoot.getRandomNumber(2) == 2){
                left();
            }
            int num = getData(0)+1; 
            setData(0,num); 
            }
    if (getX() == getData(2) && getY() == getData(3)){
        setData(1,getData(1)+2);
    }             
    if (isClearRight() == true){
            right();
        } 
    
    if (!isClearRight() == true && (isClearUp() == true || isClearDown() == true)){
        if (Greenfoot.getRandomNumber(2) == 1){
         down();
        }
        else {
           up(); 
        }} 
    if (getX() > getData(2)){
        setData(0,0);
        setData(1,0); 
    }
    
   

    
            }

}
