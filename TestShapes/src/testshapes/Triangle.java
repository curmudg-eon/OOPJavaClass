
package testshapes;


public class Triangle {
    public double s1;
    public double s2;
    public double s3;
    double s;
    //I know this naming has been inconsistent
    Triangle(double side1, double side2, double side3) {
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }
    double getPerimeter() {return s1+s2+s3;}
    double getArea() {
        s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
}
