class Square{
    private double sideLength;
    private String color;
    private boolean realOrFake;
    
    public Square (int sideLength, String color, boolean realOrFake){
        this.sideLength = sideLength;
        this. color = color;
    }
    public Square(String color){
        this.color = color;
    }
    public Square(int sideLength){
        this.sideLength = sideLength; 
    }
    public double getSideLength(){
        return sideLength;
    }
    public void setSideLength(int newSideLength){
        sideLength = newSideLength;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public boolean getRealOrFake(){
        return realOrFake;
    }
    public void setRealOrFake(boolean newRealOrFake){
        realOrFake = newRealOrFake;
    }
    public double getArea(){
        return sideLength*sideLength;
    }
    public void setArea(double newArea){
        sideLength = Math.sqrt(newArea);
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(sideLength,2),Math.pow(sideLength,2));
    }
       public String toString(){
        return String.format("Moses's sidelength:%d\nColor:%s",sideLength,color);
    }
}