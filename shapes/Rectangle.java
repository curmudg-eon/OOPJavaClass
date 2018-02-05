
package shapes;


public class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle() {
        length = 1;
        width = 1;
    }
    Rectangle(double length, double width) {
        if(length >= 0) this.length = length;
        else this.length = 0;
        if(width >= 0) this.width = width;
        else this.width = 0;
    }
    @Override
    public double getArea() {return length*width;}
    @Override
    public double getPerimeter() {return 2*length + 2*width;}
    @Override
    public double getVolume() {return 0;}
    public void setLength(double l) {if(l >= 0) length = l;}
    public void setWidth(double w) {if(w >= 0) width = w;}
    public double getLength() {return length;}
    public double getWidth() {return width;}
}