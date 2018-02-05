
package shapes;

public class RectPrism extends Rectangle {
    private double length;
    private double width;
    private double height;
    RectPrism() {
        length = 1;
        width = 1;
        height = 1;
    }
    RectPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {return super.getArea() * height;}
    public double getSurfaceArea() {return getArea();}
    
    @Override
    public double getPerimeter() {return super.getPerimeter() * height;}
    public double getLateralArea() {return getPerimeter();}
    
    @Override
    public double getVolume() {return getArea() * height;}
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
