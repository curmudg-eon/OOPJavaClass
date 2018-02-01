
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
            choiceNumber = (int)getProperInput("Enter 1 for a circle, 2 for rectangle, or 3 for triangle, or 'exit' to quit:");
            if (choiceNumber == 1) {
                line1 = getProperInput("Enter a radius: ");
                circle = new Circle(line1);
                JOptionPane.showMessageDialog(null, "Circumference is: " +circle.getCircumference()+ "\nArea is: " + circle.getArea());
            
            } else if (choiceNumber == 2) {
                line1 = getProperInput("Enter a length: ");
                line2 = getProperInput("Enter a height: ");
                rect = new Rectangle(line1, line2);
                JOptionPane.showMessageDialog(null, "Perimeter is: " +rect.getPerimeter()+ "\nArea is: " + rect.getArea());
            
            } else if (choiceNumber == 3) {
                line1 = getProperInput("Enter side 1: ");
                line2 = getProperInput("Enter side 2: ");
                line3 = getProperInput("Enter side 3: ");
                if(line1+line2 >line3 && line2+line3 >line1 && line3+line1 >line2) {
                    tri = new Triangle(line1, line2, line3);
                    JOptionPane.showMessageDialog(null, "Perimeter is: " +tri.getPerimeter()+ "\nArea is: " + tri.getArea());
                } else JOptionPane.showMessageDialog(null, "Those sides do not make a valid triangle.");
 
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input.");
            }
        }
    }
    static double getProperInput(String s) {
        boolean proceed = true;
        while (proceed) {
            if(s.equalsIgnoreCase("exit"));
            try {
               return Double.parseDouble(JOptionPane.showInputDialog(s)); 
               //proceed = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "That was an invalid input.");
            }
            
        }
        return 0.0;
    }
    
}
