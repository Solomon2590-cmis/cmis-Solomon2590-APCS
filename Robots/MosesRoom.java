import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MosesRoom extends Robot
{
    public MosesRoom(){
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
     * </ul>
     */
    public void behave(){
        //going to left down corner
      if (!isClearUp() && !isClearLeft() && getData(0) == 0){
            down();
        }
        else if (!isClearUp() && getData(0) == 0){
            left();
        }
        else if (!isClearLeft() && getData(0) == 0){
            down();
        }
      if (!isClearDown() && !isClearRight() && getData(0) == 0){
            left();
        }
        else if (!isClearDown() && getData(0) == 0){
            left();
        }
        else if (!isClearRight() && getData(0) == 0){
            down();
        }
      if (!isClearLeft() && !isClearDown() && getData(0) == 0){
            setData(0, 1);
        }
        //going up 5 and right until face obstacle 
      if (!isClearLeft() && getData(1) < 5 && getData(0) == 1)
      {
          up();
          setData(1,getData(1)+1);
        }
        else if (getData(1) == 5 && isClearRight()){
            right();
        }
        else if (getData(1) == 5 && !isClearRight()){
            setData(1,0);
        }
        else if (getData(1) == 0){
            left();
        }
        
         }
}
