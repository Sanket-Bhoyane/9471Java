package com.demo.Update.Update;

/**
 * Hello world!
 *
 */

    	import javax.persistence.EntityManager;
    	import javax.persistence.EntityManagerFactory;
    	import javax.persistence.Persistence;

    	import com.demo.student.StudentEntity;

    	public class UpdateStudent {
    	public static void main(String [] args) {
    		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
    			        EntityManager em=emf.createEntityManager(); 
    			   em.getTransaction().begin();
    			        
    			        StudentEntity s1=new StudentEntity();
    			        s1.setS_id(101);
    			        s1.setS_name("Sanket");
    			        s1.setS_age(23);
    			        
    			        StudentEntity s2=new StudentEntity();
    			        s2.setS_id(102);
    			        s2.setS_name("Tare");
    			        s2.setS_age(26);   
    			        StudentEntity s3=new StudentEntity();
    			        s3.setS_id(103);
    			        s3.setS_name("Sunny");
    			        s3.setS_age(21);
    			        em.persist(s1);
    			        em.persist(s2);
    			        em.persist(s3);

    	StudentEntity s=em.find(StudentEntity.class,103);
    	System.out.println("Before Updation");
    	System.out.println("Student id="+s.getS_id());
    	System.out.println("Student name="+s.getS_name());
    	System.out.println("Student age="+s.getS_age());
    	s.setS_age(22);
    	
    	System.out.println("After Updation");
    	System.out.println("Student id="+s.getS_id());
    	System.out.println("Student name="+s.getS_name());
    	System.out.println("Student age="+s.getS_age());
    	StudentEntity s11=em.find(StudentEntity.class,103);
    	em.remove(s11);
        em.getTransaction().commit();  
        
        
        em.close();  
        emf.close(); 
    }}

