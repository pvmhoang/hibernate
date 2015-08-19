package hoang.pham.vn;

import hoang.pham.vn.model.Book;
import hoang.pham.vn.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.stat.Statistics;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by hoangpvm on 8/14/2015.
 */
@Test
public class Chap1Test {

   /* @BeforeMethod
    public void clearData(){
        Session session = SessionManager.getSessionFactory();

    }*/

    @Test
    public void selectBookByIsbn(){
        Session session = SessionManager.getSessionFactory().openSession();
        SessionStatistics sessionStatistics = session.getStatistics();
        Statistics statistics =SessionManager.getSessionFactory().getStatistics();
        Transaction transaction = session.beginTransaction();
        List<Book> bookList = (List<Book>) session.createQuery("from Book").list();
       // Book bookLoad = (Book) session.load(Book.class,"1");
        Book bookGet = (Book) session.get(Book.class,"1");
        transaction.commit();
        System.out.println("SessionStatistics" + sessionStatistics.getEntityCount());
        statistics.logSummary();
        session.close();
    }

   // @Test
    public void selectBookUseJPA(){
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityManager entityManager = SessionManager.getEntityManager();
        //entityManager.getTransaction().begin();
        List<Book> bookList = (List<Book>) entityManager.createQuery ("from Book",Book.class).getResultList();
       // entityManager.getTransaction().commit();
        entityManager.close();
    }

}
