package com.demo.CascadeMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;

import com.demo.CascadeMapping.entity.StudentEntity;


public class CascadeMapping 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("CascadeMapping");  
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	        
	  
	           
	          StudentEntity s=em.find(StudentEntity.class, 101);  
	         em.remove(s);  
	            
	          
	          em.getTransaction().commit();  
	  
	          em.close( );  
	          emf.close( );  
	          
	          
	    }  
    }

