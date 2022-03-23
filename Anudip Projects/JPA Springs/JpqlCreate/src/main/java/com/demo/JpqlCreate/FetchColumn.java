package com.demo.JpqlCreate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.JpqlCreate.entity.StudentEntity;

public class FetchColumn 
{
    public static void main( String[] args )
    {

    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
        StudentEntity s1=new StudentEntity();
        s1.setS_id(1);
        s1.setS_name("Maari");
        s1.setS_age(23);
        StudentEntity s2=new StudentEntity();
        s2.setS_id(2);
        s2.setS_name("Sanket");
        s2.setS_age(24);
        StudentEntity s3=new StudentEntity();
        s3.setS_id(3);
        s3.setS_name("Sunny");
        s3.setS_age(21);
        em.merge(s1);
        em.merge(s2);
        em.merge(s3);

        
        Query query=em.createQuery("Select s_name from StudentEntity s");
        List<String> list=query.getResultList();
        System.out.println("Student Name:");
        for(String s:list) {
        	System.out.println(s);
        }
        em.close();
        emf.close();
    }
}
