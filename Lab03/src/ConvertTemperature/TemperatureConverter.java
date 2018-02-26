
package ConvertTemperature;
//import javax.swing.JOptionPane;
//import java.util.Scanner;

public class TemperatureConverter {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = JOptionPane.showInputDialog("Enter a temperature with a C or F ex: 32F, or 'exit' to quit");
        
        while(!temp.equalsIgnoreCase("exit")) {
            if(temp.substring(temp.length() - 1).equalsIgnoreCase("f")) {
                
                JOptionPane.showMessageDialog(null, temp+ " in Celsius is: "+getCelsius(Double.parseDouble(temp.substring(0, temp.length() -1)))+ "C");
            }
            else if(temp.substring(temp.length() - 1).equalsIgnoreCase("c")) {
                
                JOptionPane.showMessageDialog(null, temp+ " in Fahrenheit is: "+getFahrenheit(Double.parseDouble(temp.substring(0, temp.length() -1)))+ "F");
            } else { 
            JOptionPane.showMessageDialog(null, "That wasn't a valid input.");
            }
            temp = JOptionPane.showInputDialog("Enter a temperature with a C or F(32F), or exit to quit");
        }
    }*/
    static double getFahrenheit(double c) {
        return Math.round(9.0/5 * c + 32);
    }
    static double getCelsius(double f) {
        return Math.round(5.0/9 * (f - 32));
    }
}
