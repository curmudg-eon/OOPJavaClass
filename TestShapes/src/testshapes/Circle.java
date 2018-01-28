//Gabe Secula
package testshapes;

public class Circle {
    public double radius=0;
    Circle(double r) {
        radius = r;
    }
    double getArea() {return Math.pow(radius,2) * Math.PI;}
    double getCircumference() {return radius*2*Math.PI;}
    
}
