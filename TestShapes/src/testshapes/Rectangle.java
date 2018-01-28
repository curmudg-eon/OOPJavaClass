
package testshapes;


public class Rectangle {
    public double length=0;
    public double width=0;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double getArea() {return length*width;}
    double getCircumference() {return 2*length + 2*width;}
}
