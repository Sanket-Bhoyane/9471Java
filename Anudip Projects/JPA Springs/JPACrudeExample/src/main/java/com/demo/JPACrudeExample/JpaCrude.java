package com.demo.JPACrudeExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JPACrudeExample.entity.Player;

/**
 * Hello world!
 *
 */
public class JpaCrude 
{
    public static void main( String[] args ) throws Exception{
    	
    	JpaCrude.createRecord();
    	
    }


private static void createRecord() {
	// TODO Auto-generated method stub
 try {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_CRUDE");  
        EntityManager em=emf.createEntityManager();  
        em.getTransaction().begin();
          
      Player p1=new Player();
      p1.setLoginName("Sanket");
      p1.setEmailAddress("bhoyanesanket123@gmail.com");
      p1.setPassword("sanket.123");
      
      em.persist(p1);
      em.getTransaction().commit();
      
      em.close();
      emf.close();
    }
    catch(Exception e) {}
      
    }
}
