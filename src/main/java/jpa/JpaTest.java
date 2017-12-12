package jpa;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import fr.ensai.tpjpaensai.domain.Person;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityTransaction tx = EntityManagerHelper.getEntityManager().getTransaction();
		tx.begin();
		try {

			Person p = new Person();
			p.setName("toto");
			p.setFirstname("titi");
			EntityManagerHelper.getEntityManager().persist(p);

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		Query q= EntityManagerHelper.getEntityManager()
				.createQuery("select p from Person as p where p.name=:name and p.firstname=:titi");
		q.setParameter("name", "toto");
		q.setParameter("titi", "foo");
		q.setMaxResults(30);
		List<Person> ps =  q.getResultList();


		
	}

}