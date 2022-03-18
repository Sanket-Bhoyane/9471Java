package com.demo.OtOMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.OtOMapping.entity.Library;
import com.demo.OtOMapping.entity.Student;

public class OtOExample 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Book_issued");  
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin(); 
   Student s1=new Student();
   s1.setS_id(1);
   s1.setS_name("Tare");
   
   Student s2=new Student();
   s2.setS_id(2);
   s2.setS_name("Yeda"); 
   
   em.merge(s1);
   em.merge(s2);
    Library l1=new Library();
    l1.setB_id(101);
    l1.setB_name("Java Programming");
    l1.setStud(s1);
 
    Library l2=new Library();
    l2.setB_id(102);
    l2.setB_name("Java Script");
    l2.setStud(s2);
    
    em.merge(l1);
    em.merge(l2);
    em.getTransaction().commit();
    em.close();
    em.close();
 }
}
