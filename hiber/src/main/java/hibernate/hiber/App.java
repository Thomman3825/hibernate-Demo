package hibernate.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.internal.SessionFactoryImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
//        Employee emp = new Employee();
//        emp.setEmp_id(113);
//        emp.setF_name("Don");
//        emp.setL_name("Sagar");
    	
    	Employee emp1 = null;
    	
        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        
        //ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        
         SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        emp1 = session.get(Employee.class, 112);
        System.out.println(emp1.getF_name()+" " +emp1.getL_name());
//         session.save(emp);
         //tx.commit();
        session.close();
        
        
        Session session1 = factory.openSession();
         session1.beginTransaction();
         emp1 = session1.get(Employee.class, 112);
        System.out.println(emp1.getF_name()+" " +emp1.getL_name());
        session1.close();
    }
}
