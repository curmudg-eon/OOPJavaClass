
package books;


public class Book {
    private String title;
    Author author;
    private int numberOfPages;

    public Book(String title, Author author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public String getInfo() {
        return getTitle() + " by " + getAuthor().getName() + "\n\tPage Count: " + getNumberOfPages() + "\n";
    }
    
}
