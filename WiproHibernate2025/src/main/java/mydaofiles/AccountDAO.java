package mydaofiles;

import mypojofiles.Account;
import mypojofiles.Transaction;
import hibernateutil.HibernateUtil2;
import org.hibernate.Session;

import java.util.List;

public class AccountDAO {

    // Create Account with its Transactions
    public void createAccountWithTransaction(Account account) {
        org.hibernate.Transaction tx = null;
        try (Session session = HibernateUtil2.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            // Save Account — since transactions are cascaded, they will be saved too
            session.save(account);

            tx.commit();
            System.out.println("✅ Account and its transactions saved successfully.");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    // View all accounts
    public List<Account> getAllAccounts() {
        try (Session session = HibernateUtil2.getSessionFactory().openSession()) {
            List<Account> accounts = session.createQuery("from Account", Account.class).list();
            for (Account acc : accounts) {
                acc.getTransactions().size(); // Force fetch transactions if lazy
            }
            return accounts;
        }
    }

    // Get account by ID
    public Account getAccountById(int id) {
        try (Session session = HibernateUtil2.getSessionFactory().openSession()) {
            return session.get(Account.class, id);
        }
    }

    // Delete account by ID
    public void deleteAccount(int id) {
        org.hibernate.Transaction tx = null;
        try (Session session = HibernateUtil2.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            Account acc = session.get(Account.class, id);
            if (acc != null) {
                session.delete(acc);
                System.out.println("❌ Account deleted successfully.");
            } else {
                System.out.println("⚠️ Account not found.");
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
