package dao;
import model.Users;
import org.hibernate.Session;

public class UserDao {
    public void savepro(Users users) {
        try  {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
//            System.out.println(stock.getIdStock());
//            System.out.println(stock.getCategorie());
//            System.out.println(stock.getPrix());
//            System.out.println(stock.getProduit());
            // save the student object
            session.save(users);
            session.persist(users);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
