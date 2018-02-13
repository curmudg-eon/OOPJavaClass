/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author 00220682
 */
public class Cylinder extends Circle implements ThreeDObject {
    private double height;
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(Circle c, double height) {
        super(c.getRadius());
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getVolume(){
        return super.getArea() * height;
    }
    
    @Override
    public double getSurfaceArea(){
        return getLateralArea() + (2*super.getArea());
    }
    @Override
    public double getLateralArea() {return super.getPerimeter() * height;}
}
