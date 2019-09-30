class Square{
    private double sideLength;
    private String color;
    
    public Square (int sideLength, String color){
        this.sideLength = sideLength;
        this. color = color;
    }
    public Square(String color){
        this.color = color;
    }
    public Square(double sideLength){
        this.sideLength = sideLength; 
    }
    public double getSideLength(){
        return sideLength;
    }
    public void setSideLength(int newSideLength){
        this.sideLength = newSideLength;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public double getArea(){
        return sideLength*sideLength;
    }
    public void setArea(double newArea){
        sideLength = Math.sqrt(newArea);
    }
    public Square subtract(Square other){
        double aArea = this.getArea();
        double bArea = other.getArea();
        double positive = Math.max(aArea,bArea);
        double negative = Math.min(aArea,bArea);
        double diff = positive - negative;
        Square result = new Square(Math.sqrt(diff));
        return result; 
    }
    public String toString(){
        return String.format("Moses's sidelength:%f\nColor:%s",this.sideLength,this.color);
    }
    
}