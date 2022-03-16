package com.demo.Mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.Entity.Address;
import com.demo.Entity.Employee;


public class ListMapping 
{
    public static void main( String[] args )
    {
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Type");
      EntityManager em=emf.createEntityManager();
      em.getTransaction().begin();
      
      Address a1=new Address();
      a1.setE_pincode(411038);
      a1.setE_city("Pune");
      a1.setE_state("Maharashtra");
      Address a2=new Address();
      a2.setE_pincode(411039);
      a2.setE_city("Bengluru");
      a2.setE_state("Karanatak");
      
      Employee e1=new Employee();
      e1.setE_id(1);
      e1.setE_name("Sanket");
     
      
      Employee e2=new Employee();
      e2.setE_id(2);
      e2.setE_name("Maari");
      e1.getAddress().add(a1);  
      e2.getAddress().add(a2);  

    
      em.persist(e1);
      em.persist(e2);

em.getTransaction().commit();
em.close();
em.close();
      
    }
}
