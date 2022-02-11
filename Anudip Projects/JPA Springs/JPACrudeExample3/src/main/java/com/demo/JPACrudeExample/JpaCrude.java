package com.demo.JPACrudeExample;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    	JpaCrude.retriveRecord();
    	JpaCrude.updateRecord();
    	JpaCrude.deleteRecord();
    	}


private static void deleteRecord() {
		// TODO Auto-generated method stub
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUDE");
	EntityManager entityManager = emf.createEntityManager();
	entityManager.getTransaction().begin();

	Long key = Long.valueOf(1);
	Player p = entityManager.find(Player.class, key);
	entityManager.remove(p); // record is deleted
System.out.println("Delete Data:");
System.out.println(p.getLoginName());
	entityManager.getTransaction().commit();
}	
	


private static void updateRecord() {
		// TODO Auto-generated method stub
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUDE");
	EntityManager entityManager = emf.createEntityManager();
	entityManager.getTransaction().begin(); 

	Long key = Long.valueOf(1);
	Player p = entityManager.find(Player.class, Long.valueOf(1));
	p.setPassword("kowabunga");
	System.out.println("Update Data");
	System.out.println(p.getPassword());

	entityManager.getTransaction().commit();
}

private static void retriveRecord() {
		// TODO Auto-generated method stub
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUDE");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Long key = Long.valueOf(1);
		Player p = entityManager.find(Player.class, key);
		System.out.println("retrive data");
		System.out.println(p.getPassword()+ "" +p.getLoginName());

		entityManager.getTransaction().commit();
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
    //  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
      //Date date = new Date();
       //formatter.format(date);
      //p1.setRegistrationDate(formatter.format(date).toString());
      p1.setVerified(true);
      p1.setLastAccessTime(new java.util.Date());
    
      Player p2=new Player();
      p2.setLoginName("Maari");
      p2.setEmailAddress("Maari123@gmail.com");
      p2.setPassword("maari.123");
    //  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
      //Date date = new Date();
       //formatter.format(date);
      //p1.setRegistrationDate(formatter.format(date).toString());
      p2.setVerified(true);
      p2.setLastAccessTime(new java.util.Date());  
      
      Player p3=new Player();
      p3.setLoginName("Tare");
      p3.setEmailAddress("Tare123@gmail.com");
      p3.setPassword("tare.123");
    //  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
      //Date date = new Date();
       //formatter.format(date);
      //p1.setRegistrationDate(formatter.format(date).toString());
      p3.setVerified(true);
      p3.setLastAccessTime(new java.util.Date());  
      
      Player p4=new Player();
      p4.setLoginName("Sunny");
      p4.setEmailAddress("sunnyjadhav123@gmail.com");
      p4.setPassword("sunny.123");
    //  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
      //Date date = new Date();
       //formatter.format(date);
      //p1.setRegistrationDate(formatter.format(date).toString());
      p4.setVerified(true);
      p4.setLastAccessTime(new java.util.Date());  
       
      em.persist(p1);
      em.persist(p2);
      em.persist(p3);
      em.persist(p4);
      em.getTransaction().commit();
      Query query=em.createQuery("select p1 from Player p1");
      List<Player> list =query.getResultList();  
      System.out.println("Player details :");  
      for(Player s:list) {  
            
         System.out.println(s);  
      
           
      }
      em.close();
      emf.close();}


    catch(Exception e) {}
      
    }
}
