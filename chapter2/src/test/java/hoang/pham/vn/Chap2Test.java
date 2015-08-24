package hoang.pham.vn;

import hoang.pham.vn.model.*;
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

    //@Test
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

    //@Test
    public void testEmployee(){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee(4L,4L,"Hoang");
        session.persist(employee);
        EmployeeEx employeeEx = new EmployeeEx(1l,1L,"Lam");
        session.persist(employeeEx);
        transaction.commit();
        List<Employee> list = (List<Employee>) session.createQuery("from Employee").list();
        EmployeeEx employeeEx1 = (EmployeeEx) session.get(EmployeeEx.class, new EmployeeId(1L,1L));
        session.close();
    }

    //@Test
    public void testSaveAndUpdate(){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        MapEntry mapEntry = new MapEntry("Key2","Value1");
        session.saveOrUpdate(mapEntry);
        transaction.commit();
        session.close();
        session = SessionManager.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        mapEntry = new MapEntry("Key2","Value2");
        session.saveOrUpdate(mapEntry);
        transaction.commit();
        session.close();
    }

    //@Test
    public void testStandardSQL(){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StandardSQLEntity standardSQLEntity = new StandardSQLEntity();
        standardSQLEntity.setField1("Field2");
        session.save(standardSQLEntity);
        transaction.commit();
        List<StandardSQLEntity> lst = session.createQuery("from StandardSQLEntity").list();
        session.close();
    }

    @Test
    public void testDynamicSQL(){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        DynamicSQLEntity dynamicSQLEntity = new DynamicSQLEntity();
        dynamicSQLEntity.setField1("Field3");
        session.save(dynamicSQLEntity);
        transaction.commit();
        List<DynamicSQLEntity> lst = session.createQuery("from DynamicSQLEntity").list();
        session.close();
    }
}
