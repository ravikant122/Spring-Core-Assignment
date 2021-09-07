package com.one2many.HibernateFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {
	private static SessionFactory factory=null;
	
	public HibernateSessionFactory() {}
	
	public static SessionFactory getSessionFactory() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
													.configure("hibernate.cfg.xml")
													.build();
		if(factory==null) {	// singleton
			factory=new MetadataSources(serviceRegistry)
									.buildMetadata()
									.buildSessionFactory();
		}
		return factory;
	}
}
