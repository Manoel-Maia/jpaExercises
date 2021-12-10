package base.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import base.User;

public class UserTests {
	
	public static void main(String[] args) {
		EntityManagerFactory emp = Persistence.
				createEntityManagerFactory("jpaExercises");
		EntityManager em = emp.createEntityManager();
		
		User user = new User("paulo", "paulo.machado@outlook.com.br");
		
		em.persist(user);
		
		
		em.close();
		emp.close();
	}
	
}
