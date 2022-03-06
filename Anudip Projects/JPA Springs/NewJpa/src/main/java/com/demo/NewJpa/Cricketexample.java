package com.demo.NewJpa;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.NewJpa.entity.Player;
import com.demo.NewJpa.entity.Teams;

/**
 * Hello world!
 *
 */
public class Cricketexample 
{
    public static void main( String[] args )
    {EntityManagerFactory emf = Persistence.createEntityManagerFactory( "team_issued" );  
    EntityManager em = emf.createEntityManager( );  
    em.getTransaction( ).begin( );  
   Teams t1=new Teams();
   t1.sett_name("RCB");
   t1.sett_city("Bengluru");
   Teams t2=new Teams();
   t2.sett_name("CSK");
   t2.sett_city("Chennai");

   em.persist(t1);  
      em.persist(t2);
     
      ArrayList<Teams>list=new ArrayList<Teams>();
      list.add(t1);
      list.add(t2);
Player p1=new Player();
p1.sets_name("Virat");
p1.setTeam_issued(list);

   em.persist(p1);  
   
     
em.getTransaction().commit();  
em.close();  
emf.close();  
    }
}
