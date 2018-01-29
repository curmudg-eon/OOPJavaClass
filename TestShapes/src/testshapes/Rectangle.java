
package testshapes;


public class Rectangle {
    private double length;
    private double width;
    Rectangle() {
        length = 1;
        width = 1;
    }
    Rectangle(double l, double w) {
        if(l >= 0) length = l;
        else length = 0;
        if(w >= 0) width = w;
        else width = 0;
    }
    public double getArea() {return length*width;}
    public double getCircumference() {return 2*length + 2*width;}
    public void setLength(double l) {if(l >= 0) length = l;}
    public void setWidth(double w) {if(w >= 0) width = w;}
    public double getLength() {return length;}
    public double getWidth() {return width;}
}
