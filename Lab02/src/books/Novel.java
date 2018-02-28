
package books;

public class Novel extends Book {
    private String genre;

    public Novel(String title, Author author, int numberOfPages, String genre) {
        super(title, author, numberOfPages);
        this.genre = genre;
    }
    public Novel(Book b, String genre) {
        super(b.getTitle(), b.getAuthor(), b.getNumberOfPages());
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String getInfo() {
        return getTitle() + " by " + getAuthor().getName() + "\n\tGenre: " +getGenre() + "\n\tPage Count: " + getNumberOfPages() + "\n";
    }
}
