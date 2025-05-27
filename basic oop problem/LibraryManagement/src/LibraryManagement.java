import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    static long UserId = 1;
    static long bookId = 1;
    List<LibraryMember> memberList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();

    public LibraryManagement(List<LibraryMember> memberList, List<Book> bookList) {
        this.memberList = memberList;
        this.bookList = bookList;
    }

    public void addMember(String name, int age, String mobileNumber, String emailAddress){
        memberList.add(new LibraryMember(name, UserId++, age, mobileNumber, emailAddress));
    }

    public void addMember(String name){
        memberList.add(new LibraryMember(name, UserId++));
    }

    public void addNewBook(String bookName, String authorName, String bookType, int editionNumber, int publishedYear, String ISBN_code){
        bookList.add(new Book(bookName, authorName, bookType, bookId++, editionNumber, publishedYear, ISBN_code));
    }

    public void addNewBook(String bookName, String authorName, int publishedYear){
        bookList.add(new Book(bookName, authorName, bookId++, publishedYear));
    }


    public void showAllBooks(){
        bookList.forEach(v -> {
            System.out.println("Book ID: " + v.getBookId());
            System.out.println("Book Name: " + v.getBookName());
            System.out.println("Book Author Name: " + v.getAuthorName());
            System.out.println("Published Year: " + v.getPublishedYear());

            if(v.getBookType()!=null){
                System.out.println("Book Type: " + v.getBookType());
            }
            if(v.getEditionNumber()!=-1){
                System.out.println("Edition Number: " + v.getEditionNumber());
            }
            if(v.getISBN_code()!=null){
                System.out.println("Book ISBN: " + v.getISBN_code());
            }
        });
    }

    public void showAllMembers(){
        System.out.println("Members List:\n");
        memberList.forEach(v -> {
            System.out.println("Member ID: " + v.getMemberId());
            System.out.println("Member Name: " + v.getMemberName());
            if(v.getMemberAge()!=-1){
                System.out.println("Member age: " + v.getMemberAge());
            }
            if(v.getMobileNumber()!=null){
                System.out.println("Member Mobile Number: " + v.getMobileNumber());
            }
            if(v.getEmailAddress()!=null){
                System.out.println("Member Email: " + v.getEmailAddress());
            }
        });
    }

    public List<LibraryMember> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<LibraryMember> memberList) {
        this.memberList = memberList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
