
package testshapes;

import javax.swing.JOptionPane;

public class TestShapes {

    public static void main(String[] args) {
        int choiceNumber = 0;
        double line1, line2, line3;
        Circle circle;
        Rectangle rect;
        Triangle tri;
        String tempString = ""; //JOptionPane.showInputDialog("Enter 1 for a circle, 2 for rectangle, or 3 for triangle, or 'exit' to quit: ");
        while(true) {
            tempString = JOptionPane.showInputDialog("Enter 1 for a circle, 2 for rectangle, or 3 for triangle, or 'exit' to quit: ");
            if (tempString.equalsIgnoreCase("exit")) System.exit(0);
            choiceNumber = Integer.parseInt(tempString);
            if (choiceNumber == 1) {
                line1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a radius: "));
                circle = new Circle(line1);
                JOptionPane.showMessageDialog(null, "Circumference is: " +circle.getCircumference()+ "\nArea is: " + circle.getArea());
            
            } else if (choiceNumber == 2) {
                line1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a length: "));
                line2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a height: "));
                rect = new Rectangle(line1, line2);
                JOptionPane.showMessageDialog(null, "Perimeter is: " +rect.getPerimeter()+ "\nArea is: " + rect.getArea());
            
            } else if (choiceNumber == 3) {
                line1 = Double.parseDouble(JOptionPane.showInputDialog("Enter side 1: "));
                line2 = Double.parseDouble(JOptionPane.showInputDialog("Enter side 2: "));
                line3 = Double.parseDouble(JOptionPane.showInputDialog("Enter side 3: "));
                if(line1+line2 >line3 && line2+line3 >line1 && line3+line1 >line2) {
                    tri = new Triangle(line1, line2, line3);
                    JOptionPane.showMessageDialog(null, "Perimeter is: " +tri.getPerimeter()+ "\nArea is: " + tri.getArea());
                } else JOptionPane.showMessageDialog(null, "Those sides do not make a valid triangle.");
 
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input.");
            }
        }
    }
    
}
