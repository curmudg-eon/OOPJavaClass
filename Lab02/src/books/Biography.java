
package books;

public class Biography extends Book{
    private String subject;

    public Biography(String title, Author author, int numberOfPages, String subject) {
        super(title, author, numberOfPages);
        this.subject = subject;
    }
    public Biography(Book b, String subject) {
        super(b.getTitle(), b.getAuthor(), b.getNumberOfPages());
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String getInfo() {
        return getTitle() + " by " + getAuthor().getName() + "\n\tSubject: " +getSubject() + "\n\tPage Count: " + getNumberOfPages()+"\n";
    }
}
