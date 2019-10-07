public class RegularPolygon{
    private int nSides;
    private double sideLength;
    
    public RegularPolygon(int nSides, double sideLength){
        this.nSides = nSides;
        this.sideLength = sideLength;
    }
    
    public int getNSides(){
        return nSides;
    }
    
    public void setNSides(int newNSides){
        this.nSides = newNSides;
    }
    
    public double getSideLength(){
        return sideLength;
    }
    
    public void setSideLength(double newSideLength){
        this.sideLength = newSideLength;
    }
    
    public double getPerimeter(){
        return sideLength*nSides;
    }
    
    public void setPerimeter(double newPerimeter){
        this.sideLength = newPerimeter/nSides;
    }
    
    public double getRadius(){
        double R = Math.toRadians(180);
        return sideLength/(2*Math.sin(R/nSides));
    }
    
    public void setRadius(double newRadius){
        double R = Math.toRadians(180);
        sideLength = newRadius*(2*Math.sin(R/nSides)); 
    }
    
    public double getApothem(){
        double r = Math.toRadians(180);
        return this.sideLength/(2*Math.tan(r/this.nSides));
    }
    
    public double getArea(){
        return (getApothem()*getPerimeter())/2;
    }
    
    public void changeArea(double pct){
        double area;
        area = getArea()*pct;
        double newApo = getApothem()*pct;
        this.sideLength = ((area*(2*pct)*newApo)/nSides);
    }
    
    public double getLongestBisector(){
        int evenOrOdd = nSides%2;
        double radius1 = getRadius();
        double radiusOrApothem;
        radiusOrApothem = evenOrOdd * getApothem();
        evenOrOdd -= 1;
        radiusOrApothem += -1*(evenOrOdd * radius1);
        return radius1 + radiusOrApothem; 
    }
    
    public double getShortestBisector(){
        int evenOrOdd = nSides%2;
        double apothem1 = getApothem();
        double radiusOrApothem;
        radiusOrApothem = evenOrOdd * getRadius();
        evenOrOdd -=1;
        radiusOrApothem += -1*(evenOrOdd * getApothem());
        return apothem1 + radiusOrApothem; 
    }
    
    public int fitsIn(RegularPolygon other){
        double radi = other.getRadius();
        double apothem = getApothem();
        int multi = (Double.compare(apothem,radi))+1;
        return multi * 1; 
    }
    
    public void inscribe(RegularPolygon other){
        double otherApothem = other.getApothem();
        setRadius(otherApothem);
    }
    
    public String toString(){
        return "hi";
    }
    
    public static void main(String[] agrv){
        RegularPolygon test1 = new RegularPolygon(5,10);
        System.out.println(test1.getRadius());
    }
}