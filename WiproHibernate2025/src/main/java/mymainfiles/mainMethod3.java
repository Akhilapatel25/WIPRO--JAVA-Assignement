package mymainfiles;

import mydaofiles.BookAuthorDAO;
import mypojofiles.Author;
import mypojofiles.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookAuthorDAO dao = new BookAuthorDAO();

        while (true) {
            System.out.println("\n--- Hibernate: Book & Author Many-to-Many ---");
            System.out.println("1. Add Book with Authors");
            System.out.println("2. View All Books");
            System.out.println("3. View All Authors");
            System.out.println("4. Delete Book");
            System.out.println("5. Delete Author");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    Book book = new Book(title);

                    System.out.print("Enter number of authors: ");
                    int count = sc.nextInt(); sc.nextLine();

                    for (int i = 1; i <= count; i++) {
                        System.out.print("Enter author " + i + " name: ");
                        String name = sc.nextLine();
                        Author author = new Author(name);
                        book.addAuthor(author);
                    }

                    dao.addBookWithAuthors(book);
                    break;

                case 2:
                    List<Book> books = dao.getAllBooks();
                    books.forEach(System.out::println);
                    break;

                case 3:
                    List<Author> authors = dao.getAllAuthors();
                    authors.forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    dao.deleteBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Author ID to delete: ");
                    dao.deleteAuthor(sc.nextInt());
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
