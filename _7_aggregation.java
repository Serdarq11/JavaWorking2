public class _7_aggregation {
    public static void main(String[] args){

        // Aggregation : Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("The fellowship of the ring", 423);
        Book book2 = new Book("The two towers", 352);
        Book book3 = new Book("The return of the king", 416);

        Book[] books = {book1, book2, book3};

        System.out.println(book1.displayInfo());    // The fellowship of the ring (423 pages)

        for(Book book : books){
            System.out.println(book.displayInfo());
        }

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();  // The 1897 NYC Public Library
        // Books available:
        // The fellowship of the ring (423 pages)
        // The two towers (352 pages)
        // The return of the king (416 pages)


    }
}

// The library objects has a book object inside of it. If we delete library object, the book object can remain independently.
//                  Library     &       Book
