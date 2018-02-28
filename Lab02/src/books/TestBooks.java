
package books;
import javax.swing.*;
import java.util.ArrayList;

public class TestBooks {

    public static void main(String[] args) {
	   ArrayList<Book> BookList = new ArrayList<Book>(); 
	   String optionChoice = "";
	   while(true) {
		 optionChoice =  JOptionPane.showInputDialog(null, "Choose one", "Book Entry", 0, null, new String[] {"Generic", "Novel", "Textbook", "Biography", "Show Current List"}, null).toString();
		switch(optionChoice) {
			case "Generic":
				BookList.add(enterBook());
				break;
			case "Novel":
				BookList.add(new Novel(enterBook(), JOptionPane.showInputDialog("Enter a genre")));
				break;
			case "Textbook":
				BookList.add(new Textbook(enterBook(), JOptionPane.showInputDialog("Enter a grade level")));
				break;
			case "Biography":
				BookList.add(new Biography(enterBook(), JOptionPane.showInputDialog("Enter the subject of the biography")));
				break;
			case "Show Current List":
				displayBooks(BookList);
				break;
		}
	   }
    }
    public static Book enterBook() {
	   return new Book(JOptionPane.showInputDialog("Enter a title"), enterAuthor(), Integer.parseInt(JOptionPane.showInputDialog("Enter a page count")));
    }
    public static Author enterAuthor() {
	    return new Author(JOptionPane.showInputDialog("Enter Author name"), JOptionPane.showInputDialog("Enter Author Address"), JOptionPane.showInputDialog("Enter Author email address"));
    }
    public static void displayBooks(ArrayList<Book> bList) {
	    String output = "";
	    for(int i = 0; i < bList.size(); i++) {
		output += (bList.get(i).getInfo());
	    }
            JOptionPane.showMessageDialog(null, output);
    }
}
