package com.demo.MtoMMapping;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.MtoMMapping.entity.Library;
import com.demo.MtoMMapping.entity.Student;

public class MtoMMapping 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	          
	        Student st1=new Student ("Sanket",null) ;
	        Student st2=new Student ("Manish",null) ;    
	            em.persist(st1);
	            em.persist(st2);
	            
	            List<Student> al1=new ArrayList<>();
	            List<Student> al2=new ArrayList<>();
	            al1.add(st1);
	            al1.add(st2);
	            
	            al2.add(st1);
	            al2.add(st2);
	            
	            Library lib1=new Library ("DBMS",al1);
	            Library lib2=new Library ("MySQL",al2);
	            em.persist(lib1);
	            em.persist(lib2);
	        em.getTransaction().commit();  
	        em.close();  
	        emf.close();  
    }
}
