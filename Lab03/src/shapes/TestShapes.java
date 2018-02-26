
package shapes;

import javax.swing.JOptionPane;

public class TestShapes {

    public static void main(String[] args) {
        int choiceNumber;
        double line1, line2, line3;
        Circle circle;
        Rectangle rect;
        Triangle tri;
        String tempString = ""; 
        while(true) {
            choiceNumber = (int)getProperInput("1: Circle\n2: Rectangle\n3: Triangle\n4: Cylinder\n5: Rectangular Prism\n6: Triangular Prism\n7: Sphere\nor 'exit' to quit:");
            switch (choiceNumber) {
                case 1://Circle
                    circle = getCircle();
                    JOptionPane.showMessageDialog(null, "Circumference is: " +circle.getCircumference()+ "\nArea is: " + circle.getArea());
                    break;
                case 2://Rectangle
                    rect = getRect();
                    JOptionPane.showMessageDialog(null, "Perimeter is: " +rect.getPerimeter()+ "\nArea is: " + rect.getArea());
                    break;
                case 3://Triangle
                    tri = getTriangle();
                    JOptionPane.showMessageDialog(null, "Perimeter is: " +tri.getPerimeter()+ "\nArea is: " + tri.getArea());
                    break;
                case 4://Cylinder
                    Cylinder cyln = new Cylinder(getCircle(), getHeight());
                    JOptionPane.showMessageDialog(null, "Volume is: " +cyln.getVolume()+ "\nLateral Area is: " + cyln.getLateralArea() + "\nSurface Area is: " + cyln.getSurfaceArea());
                    break;
                case 5://Rectangular Prism
                    RectPrism rp = new RectPrism(getRect(), getHeight());
                    JOptionPane.showMessageDialog(null, "Volume is: " +rp.getVolume()+ "\nLateral Area is: " + rp.getLateralArea() + "\nSurface Area is: " + rp.getSurfaceArea());
                    break;
                case 6://Triangular Prism
                    TriPrism tp = new TriPrism(getTriangle(), getHeight());
                    JOptionPane.showMessageDialog(null, "Volume is: " +tp.getVolume()+ "\nLateral Area is: " + tp.getLateralArea() + "\nSurface Area is: " + tp.getSurfaceArea());
                    break;
                case 7://Sphere
                    Sphere sphere = new Sphere(getCircle());
                    JOptionPane.showMessageDialog(null, "Volume is: " +sphere.getVolume()+ "\nSurface Area is: " + sphere.getSurfaceArea());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input.");
                    break;
            }
        }
    }
    static double getProperInput(String s) {
        boolean proceed = true;
        String holder;
        while (proceed) {
            try {
                holder = JOptionPane.showInputDialog(s);
                if(holder.equalsIgnoreCase("exit")) System.exit(0);
                if(Double.parseDouble(holder) < 0) {
                    JOptionPane.showMessageDialog(null, "Input cannot be negative.");
                    continue;
                }
                return Double.parseDouble(holder); 
               //proceed = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "That was an invalid input.");
            }
            
        }
        return 0.0;
    }
    static Circle getCircle() {return new Circle(getProperInput("Enter a radius: "));}
    static Rectangle getRect() {return new Rectangle(getProperInput("Enter a length:"), getProperInput("Enter a width:"));}
    static Triangle getTriangle() { 
        while(true) {
            double line1 = getProperInput("Enter side 1: ");
            double line2 = getProperInput("Enter side 2: ");
            double line3 = getProperInput("Enter side 3: ");
            if(line1+line2 >line3 && line2+line3 >line1 && line3+line1 >line2) {
                return new Triangle(line1, line2, line3);
            } else JOptionPane.showMessageDialog(null, "Those sides do not make a valid triangle.");
        }
    }
    static double getHeight() {
        return getProperInput("Enter a height");
    }
}