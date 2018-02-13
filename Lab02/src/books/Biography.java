
package books;

public class Biography extends Book{
    private int subject;

    public Biography(int subject, String title, Author author, int numberOfPages) {
        super(title, author, numberOfPages);
        this.subject = subject;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }
    
}
