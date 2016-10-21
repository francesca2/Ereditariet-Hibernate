import hibernateUtil.HibernateUtil;
import model.*;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class MainEreditarietà {

	public static void main(String[] args) {

		Persona p1= new Studente("nome1", "cognome1", 25.3);
		Studente s1= new Studente("nome2", "cognome2", 25.3);
		Docente d1= new Docente("nome3", "cognome3", 1300);
		//		p1.setNome("nome1");
//		p1.setCognome("cognome1");
//		((Studente) p1).setMedia(27);
		
		Session session =HibernateUtil.openSession();
		Transaction tx=null;

		try{
		tx=session.getTransaction();
		tx.begin();

		session.persist(p1);
		session.persist(s1);
		session.persist(d1);
		
		 tx.commit();
		}catch(Exception ex){
			tx.rollback();
		}finally{
			session.close();
		}
		

	}

}
