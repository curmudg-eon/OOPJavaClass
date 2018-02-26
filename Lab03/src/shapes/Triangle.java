
package shapes;


public class Triangle extends Shape {
    private double s1;
    private double s2;
    private double s3;
    double s;
    //I know this naming has been inconsistent
    Triangle() {}
    Triangle(double side1, double side2, double side3) {
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }
    @Override
    public double getPerimeter() {return s1+s2+s3;}
    
    @Override
    public double getArea() {
        s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
    
}