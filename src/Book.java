public class Book {
    @BookAnnotation
    String bookName;
    @BookAnnotation("non-default value")
    String authorName;

    String authorFirstName;

    int NumberofPage;

    public Book(String bookName, String authorName, String authorFirstName, int numberofPage) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorFirstName = authorFirstName;
        NumberofPage = numberofPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public int getNumberofPage() {
        return NumberofPage;
    }

    public void setNumberofPage(int numberofPage) {
        NumberofPage = numberofPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", NumberofPage=" + NumberofPage +
                '}';
    }
}
