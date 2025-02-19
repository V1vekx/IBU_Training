abstract class libraryItem{
     private String name;
     private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public abstract void displayItems();

    public libraryItem(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

class Book extends libraryItem{

    int ISBN;
    boolean checkedOut;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Book(String name, String author, int ISBN) {
        super(name , author);
        this.ISBN = ISBN;
        this.checkedOut = false;
    }

    @Override
    public void displayItems() {
        System.out.println("name : " +getName()+    "author : " +getAuthor()+   "ISBN : " +getISBN());
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("gulivers travel","richard", 3452);
        book.displayItems();

    }


}