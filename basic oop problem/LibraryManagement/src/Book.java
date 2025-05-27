public class Book {
    String bookName;
    String authorName;
    String bookType;
    long bookId;
    int editionNumber;
    int publishedYear;
    String ISBN_code;

    public Book(String bookName, String authorName, String bookType, long bookId, int editionNumber, int publishedYear, String ISBN_code) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookType = bookType;
        this.bookId = bookId;
        this.editionNumber = editionNumber;
        this.publishedYear = publishedYear;
        this.ISBN_code = ISBN_code;
    }

    public Book(String bookName, String authorName,long bookId, int publishedYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.bookId = bookId;
        ISBN_code = null;
        bookType = null;
        editionNumber = -1;
    }

    public String getBookName() {
        return bookName;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
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

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getISBN_code() {
        return ISBN_code;
    }

    public void setISBN_code(String ISBN_code) {
        this.ISBN_code = ISBN_code;
    }
}
