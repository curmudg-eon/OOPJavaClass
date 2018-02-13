
package shapes;

public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }
    public Sphere(Circle c) {
        super(c.getRadius());
    }
    public double getSurfaceArea() {return 4* super.getArea();}
    public double getVolume() {return 4/3 * super.getArea() * super.getRadius();}
    
}
