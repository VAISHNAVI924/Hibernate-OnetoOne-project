package oneToOnebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Helper {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gst");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Company co=new Company();
		co.setName("ghh");
		co.setAddress("hjkk");
	Gst g=new Gst();
	g.setGstnumber("67");
	g.setType("iuyy");
	g.setCompany(co);

	
	et.begin();
	em.persist(g);
	em.persist(co);
	et.commit();
	}

}
