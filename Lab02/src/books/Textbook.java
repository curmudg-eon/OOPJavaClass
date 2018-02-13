
package books;

public class Textbook extends Book{
    private int gradeLevel;

    public Textbook(String title, Author author, int numberOfPages, int gradeLevel) {
        super(title, author, numberOfPages);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    
    
    
}
