package com.demo.JPACrudeExample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
      p1.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
      p1.setVerified(true);
      p1.setLastAccessTime(new java.util.Date());
      em.persist(p1);
      em.getTransaction().commit();
      Query query=em.createQuery("select p1 from Player p1");
      List<Player> list =query.getResultList();  
      System.out.println("Player details :");  
      for(Player s:list) {  
            
         System.out.println(s);  
      
           
      }
      em.close();
      emf.close();
    }
    catch(Exception e) {}
      
    }
}
