package hoang.pham.vn;

import hoang.pham.vn.model.IncrementIdEntity;
import hoang.pham.vn.model.Product;
import hoang.pham.vn.model.SequenceIdEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.stat.Statistics;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by hoangpvm on 8/14/2015.
 */

//@Test
public class Chap2Test {

    //@Test
    public void selectBookByIsbn(){
        Session session = SessionManager.getSessionFactory().openSession();
        SessionStatistics sessionStatistics = session.getStatistics();
        Statistics statistics =SessionManager.getSessionFactory().getStatistics();
        Transaction transaction = session.beginTransaction();
        Product product = new Product();
        product.setSku(6);
        product.setTitle("Java By Example");
        product.setDescription("Best book for you if you like noddle");
        session.persist(product);
        transaction.commit();
        List<Product> bookList = (List<Product>) session.createQuery("from Product").list();
        System.out.println("SessionStatistics" + sessionStatistics.getEntityCount());
        statistics.logSummary();
        session.close();
    }

    //@Test
    public void testSequenceIdEntity(){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        for (int i = 0; i < 5 ; i++) {
            SequenceIdEntity sequenceIdEntity = new SequenceIdEntity();
            sequenceIdEntity.setField(String.valueOf(i));
            session.persist(sequenceIdEntity);
        }
        transaction.commit();
        List<SequenceIdEntity> list = (List<SequenceIdEntity>) session.createQuery("from SequenceIdEntity").list();
        session.close();
    }

    @Test
    public void testIncrementIdEntity(){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        for (int i = 0; i < 5 ; i++) {
            IncrementIdEntity incrementIdEntity = new IncrementIdEntity();
            incrementIdEntity.setField(String.valueOf(i));
            session.persist(incrementIdEntity);
        }
        transaction.commit();
        List<SequenceIdEntity> list = (List<SequenceIdEntity>) session.createQuery("from SequenceIdEntity").list();
        session.close();
    }

}
