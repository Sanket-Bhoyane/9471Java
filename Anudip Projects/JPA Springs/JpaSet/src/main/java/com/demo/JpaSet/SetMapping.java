package com.demo.JpaSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.entity.Address;
import com.demo.entity.Employee;

/**
 * Hello world!
 *
 */
public class SetMapping 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Type");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();
        Address a1=new Address();
        a1.setE_pincode(411023);
        a1.setE_city("jalna");
        a1.setE_state("Maharashtra");
 
        Address a2=new Address();
        a2.setE_pincode(411024);
        a2.setE_city("patiala");
        a2.setE_state("punjab");
        Address a3=new Address();
        a3.setE_pincode(411011);
        a3.setE_city("keral");
        a3.setE_state("tamilnadu");
        Address a4=new Address();
        a4.setE_pincode(411012);
        a4.setE_city("texas");
        a4.setE_state("new York");
        
    Employee e1=new Employee();
    e1.setE_id(1);
    e1.setE_name("Sanket");
    Employee e2=new Employee();
    e2.setE_id(2);
    e2.setE_name("Maari");
    Employee e3=new Employee();
    e3.setE_id(3);
    e3.setE_name("King");
    Employee e4=new Employee();
    e4.setE_id(4);
    e4.setE_name("Royal");
 e1.getAddress().add(a1);
 e2.getAddress().add(a2);
 e3.getAddress().add(a3);
 e4.getAddress().add(a4);
 
 em.persist(e1);
 em.persist(e2);
 em.persist(e3);
 em.persist(e4);
 
 em.getTransaction().commit();
 em.close();
 emf.close();
 
}
}
