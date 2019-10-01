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
    
    public double setRadius(double newRadius){
        double R = Math.toRadians(180);
        return newRadius*(2*Math.sin(R/nSides)); 
    }
    
    public String toString(){
        return "hi";
    }
    
    public static void main(String[] agrv){
        RegularPolygon test1 = new RegularPolygon(5,10);
        System.out.println(test1.getRadius());
        System.out.println(test1.setRadius(8.5));
    }
}