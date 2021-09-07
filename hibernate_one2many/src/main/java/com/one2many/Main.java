package com.one2many;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.one2many.HibernateFactory.HibernateSessionFactory;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Animal lions = new Animal("lions", 25);
		Animal tigers = new Animal("tigers", 35);
		Animal vultures = new Animal("vultures", 45);
		Animal sparrows = new Animal("sparrows", 45);
	
		Category herbivores=new Category("herbivores");
		Category carnivores=new Category("carnivores");
	
		lions.setCategory(carnivores);
		tigers.setCategory(carnivores);
		vultures.setCategory(herbivores);
		sparrows.setCategory(herbivores);
		
		carnivores.getAnimalList().add(lions);
		carnivores.getAnimalList().add(tigers);
		herbivores.getAnimalList().add(vultures);
		herbivores.getAnimalList().add(sparrows);
		
		Transaction tx = session.getTransaction();
		
		try {
			tx.begin();
			
			session.persist(lions);
			session.persist(tigers);
			session.persist(vultures);
			session.persist(sparrows);
			
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		session.close();
		sessionFactory.close();
	}
}
