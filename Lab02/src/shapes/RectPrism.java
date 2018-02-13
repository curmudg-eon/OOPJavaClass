
package shapes;

public class RectPrism extends Rectangle implements ThreeDObject {
    private double length;
    private double width;
    private double height;
    RectPrism() {
        super(1,1);
        height = 1;
    }
    RectPrism(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    RectPrism(Rectangle r, double height) {
        super(r.getLength(), r.getWidth());
        this.height = height;
    }
    @Override
    public double getArea() {return super.getArea() * height;}
    @Override
    public double getSurfaceArea() {return getLateralArea() + (2*super.getArea());}
    @Override
    public double getLateralArea() {return super.getPerimeter() * height;}
    
    @Override
    public double getVolume() {return getArea() * height;}
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
