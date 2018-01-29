//Gabe Secula
package testshapes;

public class Circle {
    private double radius;
    Circle() {
        this.radius = 1;
    }
    Circle(double r) {
        this.radius = r;
    }
    public double getArea() {return Math.pow(radius,2) * Math.PI;}
    public double getCircumference() {return radius*2*Math.PI;}
    public double getRadius() {return radius;}
    public void setRadius(double r) {if(r >= 0) this.radius = r;}
}
