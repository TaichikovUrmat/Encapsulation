//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //////////   1  task  ////////////

        Contact[] contacts1 = {
                new Contact("Asan" , "+996444444444"),
                new Contact("Nurkamil" , "+996444444444")
        };

        Contact[] contacts2 = {
                new Contact("Yson", "+9969999444"),
                new Contact("Nurlan", "+9964990343"),
                new Contact("Nur", "+9960004040")
        };

        Phone phone1 = new Phone("Samsung", "Galaxy S20", 799, "User1", contacts1);
        Phone phone2 = new Phone("Apple", "iPhone 12", 999, "User2", contacts2);

//        phone1.getContactCount();
//        System.out.println();
//        phone2.getContactCount();

        //////////   2 task  ////////////
        // save library
        Library library = new Library(1, "Central Library");
        // save book
        Book book1 = new Book(1, "Ak-Keme", 15, 2020, "Chyngyz Aitmatov");
        Book book2 = new Book(2, "Alipe", 12, 2018, "Author2");
        // save book and library
        library.addBook(book1);
        library.addBook(book2);
//         // getAll Books
//        library.AllBooks();
         // getByBookId
//        library.getBookById(2);
//        library.AllBooks();
//        System.out.println("Book with ID 2: " + library.getBookById(2));
//         // update Book
//        Book updatedBook = new Book(2, "Updated Book2", 30, 2018, "Author2");
          library.updateBook(2,new Book(2, "Updated Book2", 30, 2018, "Author2"));
          library.AllBooks();
//       //-------------------------------------------------------------
         // AllBooks
//        library.AllBooks();
//        // deleteBookId cherez id
//        library.deleteBookById(1);
//
//        library.AllBooks();



    }
}