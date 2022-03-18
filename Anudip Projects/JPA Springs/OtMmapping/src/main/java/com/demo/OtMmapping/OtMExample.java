package com.demo.OtMmapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.OtMmapping.entity.Library;
import com.demo.OtMmapping.entity.Student;

public class OtMExample 
{
    public static void main( String[] args )
    {

   	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin(); 
	        Library l1=new Library();
	     //  l1.setB_id(101);
	        l1.setB_name("Data Structure");
	    
	        Library l2=new Library();
	     //  l2.setB_id(102);
	        l2.setB_name("Cloud Computing");
	        
	        em.persist(l1);
	        em.persist(l2);
	        
	        ArrayList<Library> list=new ArrayList<>();
	        list.add(l1);
	        list.add(l2);
	        
	        Student s1=new Student();
	    //   s1.setS_id(1);
	        s1.setS_name("Maari");
	        s1.setBooks_issued(list);
    
	        em.persist(s1);
	        
	        em.getTransaction().commit();
	        em.close();
	        emf.close();

    }
}
