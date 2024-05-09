import java.util.Arrays;

public class Library {
    private int id;
    private String name;
    private Book[] books;
    private int bookCount;

    public Library(){}

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new Book[100]; // Предполагая, что библиотека может вместить до 100 книг.
        this.bookCount = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBookCount() {
        return bookCount;
    }
   // save book
    public void addBook(Book book) {
        books[bookCount++] = book;
    }

    // getById book
    public void getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("id: " + book.getId() + " name: " + book.getName() + " price:  " + book.getPrice() + "  AuthorName:  " + book.getAuthorName() + " PublishedYear:  " + book.getPublishedYear());
                break;
            }
        }
    }
    // update book
    public  void updateBook(int id, Book newBook) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == id) {
                books[i] = newBook;
                break;
            }
        }
//        return newBook;
    }
    public void deleteBookById(int id){
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getId() == id) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j +1];
                }
                bookCount --;
                System.out.println(" deleted !! ");
                break;
            }
        }
    }
    // getAll book
    public void AllBooks() {
       //  Книги в библиотеке
        System.out.println(" Книги в библиотеке " + name + ":");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("ID: " + books[i].getId() + ", Name: " + books[i].getName() + ", Author: " + books[i].getAuthorName());
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                ", bookCount=" + bookCount +
                '}';
    }
}
