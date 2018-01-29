
package ConvertTemperature;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = JOptionPane.showInputDialog("Enter a temperature with a C or F, or exit to quit");
        
        while(!temp.equalsIgnoreCase("exit")) {
            temp.length
            JOptionPane.showMessageDialog(null, "");
            temp = JOptionPane.showInputDialog("Enter a temperature with a C or F, or exit to quit");
        }
    }
    double getFahrenheit(double c) {
        return 9/5 * c + 32;
    }
    double getCelcius(double c) {
        return 5/9 * (c - 32);
    }
}
