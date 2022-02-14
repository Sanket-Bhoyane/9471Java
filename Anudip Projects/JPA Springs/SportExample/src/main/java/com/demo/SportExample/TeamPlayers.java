package com.demo.SportExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.SportExample.entity.Player;
import com.demo.SportExample.entity.Team;

public class TeamPlayers 
{
    public static void main( String[] args )
    {
            EntityManagerFactory emf =     
    	        Persistence.createEntityManagerFactory("team_players");
    	    EntityManager em = emf.createEntityManager();
    	    em.getTransaction().begin();

    	    Team team = new Team();
    	    Player p1 = new Player();
    	    Player p2 = new Player();

    	    Team team1 = new Team();
    	    Player p3 = new Player();
    	    Player p4 = new Player();

    	    em.persist(team);
    	    em.persist(team1);
    	    em.persist(p1);
    	    em.persist(p2);
    	    em.persist(p3);
    	    em.persist(p4);
    	    
    	    team.setName("Chennai Super Kings");
    	    p1.setNickName("Mahi");
    	    p1.setTeam(team);
    	    p2.setNickName("DJ Bravo");
    	    p2.setTeam(team);
    	    
    	    team1.setName("Mumbai Indians");
    	    p3.setNickName("Hitman");
    	    p3.setTeam(team1);
    	    p4.setNickName("Boom-Boom Bumrah");
    	    p4.setTeam(team1);
    	    em.getTransaction().commit();
    	  }
    }

