package com.demo.MapMapping1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.MapMapping1.entity.Address;
import com.demo.MapMapping1.entity.Employee;

/**
 * Hello world!
 *
 */
public class ListMapping 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collections_type");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
Address a1=new Address();
a1.setE_pincode(4545);
a1.setE_city("Pune");
  a1.setE_state("Maharashtra"); 
  Address a2=new Address();
  a2.setE_pincode(4445);
  a2.setE_city("kalu");
    a2.setE_state("goa"); 
    Address a3=new Address();
    a3.setE_pincode(4345);
    a3.setE_city("konkan");
     a3.setE_state("Harne");
     Address a4=new Address();
     a4.setE_pincode(4245);
     a4.setE_city("kamk");
      a4.setE_state("nashik"); 
      
    Employee e1=new Employee();
    e1.setE_id(22);
    e1.setE_name("Yeda");
    Employee e2=new Employee();
    e2.setE_id(23);
    e2.setE_name("Tare");
    Employee e3=new Employee();
    e3.setE_id(24);
    e3.setE_name("Sunny");
    Employee e4=new Employee();
    e4.setE_id(25);
    e4.setE_name("Manya");
   e1.getMap().put(22, a1);
   e2.getMap().put(23, a2); 
   e3.getMap().put(24, a3);
   e4.getMap().put(25, a4);
  
   em.persist(e1);  
   em.persist(e2);  
   em.persist(e3);  
   em.persist(e4);  
     
   em.getTransaction().commit();  
     
   em.close();  
   emf.close();  
}
}
