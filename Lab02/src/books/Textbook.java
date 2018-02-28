
package books;

public class Textbook extends Book{
    private String gradeLevel;

    public Textbook(String title, Author author, int numberOfPages, String gradeLevel) {
        super(title, author, numberOfPages);
        this.gradeLevel = gradeLevel;
    }
    public Textbook(Book b, String gradeLevel) {
        super(b.getTitle(), b.getAuthor(), b.getNumberOfPages());
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    
    @Override
    public String getInfo() {
        return getTitle() + " by " + getAuthor().getName() + "\n\tGradelevel: " +getGradeLevel() + "\n\tPage Count: " + getNumberOfPages()+"\n";
    }
    
}
