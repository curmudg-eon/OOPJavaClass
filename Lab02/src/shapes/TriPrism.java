
package shapes;

public class TriPrism extends Triangle implements ThreeDObject {
    private double height;
    public TriPrism() {
        super(1,1,1);
        height = 1;
    }
    public TriPrism(double side1, double side2, double side3, double height) {
        super(side1, side2, side3);
        this.height = height;
    }
    public TriPrism(Triangle t, double height) {
        super(t.getS1(), t.getS2(), t.getS3());
        this.height = height;
    }
    
    
    @Override
    public double getVolume(){
        return super.getArea() * height;
    }
    @Override
    public double getSurfaceArea(){
        return getLateralArea() + (2*super.getArea());
    }
    @Override
    public double getLateralArea() {return super.getPerimeter() * height;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}
    
}

