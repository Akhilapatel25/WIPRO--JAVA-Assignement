package mydaofiles;

import mypojofiles.Author;
import mypojofiles.Book;
import hibernateutil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookAuthorDAO {

    public void addBookWithAuthors(Book book) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(book);
            tx.commit();
        }
    }

    public List<Book> getAllBooks() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Book", Book.class).list();
        }
    }

    public List<Author> getAllAuthors() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Author", Author.class).list();
        }
    }

    public void deleteBook(int bookId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Book book = session.get(Book.class, bookId);
            if (book != null) session.delete(book);
            tx.commit();
        }
    }

    public void deleteAuthor(int authorId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Author author = session.get(Author.class, authorId);
            if (author != null) session.delete(author);
            tx.commit();
        }
    }
}
