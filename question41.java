package javaassignment;


import java.util.*;

//BookStore class
class BookStore {
 private int bookId;
 private String bookName;

 public BookStore(int bookId, String bookName) {
     this.bookId = bookId;
     this.bookName = bookName;
 }

 public int getBookId() {
     return bookId;
 }

 public String getBookName() {
     return bookName;
 }

 @Override
 public String toString() {
     return "BookID: " + bookId + ", Book Name: " + bookName;
 }
}

//Comparator to sort by Book Name
class SortByBookName implements Comparator<BookStore> {
 @Override
 public int compare(BookStore b1, BookStore b2) {
     return b1.getBookName().compareToIgnoreCase(b2.getBookName());
 }
}

//Comparator to sort by Book ID
class SortByBookId implements Comparator<BookStore> {
 @Override
 public int compare(BookStore b1, BookStore b2) {
     return Integer.compare(b1.getBookId(), b2.getBookId());
 }
}

//Main class to test
public class question41{
 public static void main(String[] args) {
     List<BookStore> books = new ArrayList<>();
     books.add(new BookStore(103, "Data Structures"));
     books.add(new BookStore(101, "Java Programming"));
     books.add(new BookStore(105, "Operating Systems"));
     books.add(new BookStore(102, "Algorithms"));

     System.out.println("Sorted by Book Name:");
     Collections.sort(books, new SortByBookName());
     for (BookStore b : books) {
         System.out.println(b);
     }

     System.out.println("\nSorted by Book ID:");
     Collections.sort(books, new SortByBookId());
     for (BookStore b : books) {
         System.out.println(b);
     }
 }
}


/*
 * Sorted by Book Name:
BookID: 102, Book Name: Algorithms
BookID: 103, Book Name: Data Structures
BookID: 101, Book Name: Java Programming
BookID: 105, Book Name: Operating Systems

Sorted by Book ID:
BookID: 101, Book Name: Java Programming
BookID: 102, Book Name: Algorithms
BookID: 103, Book Name: Data Structures
BookID: 105, Book Name: Operating Systems

*/
