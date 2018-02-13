
package books;

public class Novel extends Book {
    private String genre;

    public Novel(String genre, String title, Author author, int numberOfPages) {
        super(title, author, numberOfPages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
