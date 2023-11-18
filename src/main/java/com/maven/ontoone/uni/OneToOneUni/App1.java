package com.maven.ontoone.uni.OneToOneUni;





import com.maven.ontoone.uni.OneToOneUni.model.Address;
import com.maven.ontoone.uni.OneToOneUni.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App1 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("UsersDB");
        EntityManager em=emf.createEntityManager();
        
        //create and persist a student with an address.
     //   Student student=new Student("Mahanti","Mankala");
        try
        {
        Student student=new Student("Mahanti","Manakala");
        Address address=new Address("Basavapur","siddipet","505473");
        student.setAddress(address);
        
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        }
        catch(Exception e)
        {
        	
        }
       
    }
}
