import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InHibernate {
    // 主函数
    public static void main(String[] args) {
        String path = "hibernate.cfg.xml";
        Configuration cfg = new Configuration().configure(path);

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User();
        user.setId("46");
        user.setName("aaa");
        session.save(user);
        // session.close();
        session.getTransaction().commit();
        sessionFactory.close();
    }
}