package com.qarri.lab_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBhandler {
	private Configuration config;
	private SessionFactory factory;
	private Session session;
	private Transaction t;
	
	public DBhandler() {
		 config = new Configuration();
		 config.addAnnotatedClass(Person.class);
		 config.configure();
	}
     
     public void save(Person p) {
    	 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		 this.factory = config.buildSessionFactory(serviceRegistry); 
    	 this.session = factory.openSession(); 
	     this.t = session.beginTransaction();
	     session.save(p);
	     t.commit();
	     session.close();
	     factory.close();
	     serviceRegistry.close();
     }
     public void delete(int id) {
    	 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		 this.factory = config.buildSessionFactory(serviceRegistry); 
    	 this.session = factory.openSession(); 
	     this.t = session.beginTransaction();
	     session.delete(id);
	     t.commit();
	     session.close();
	     factory.close();
	     serviceRegistry.close();
     }
     
     public void update(Person p) {
    	 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		 this.factory = config.buildSessionFactory(serviceRegistry); 
    	 this.session = factory.openSession(); 
	     this.t = session.beginTransaction();
	     session.update(p);
	     t.commit();
	     session.close();
	     factory.close();
	     serviceRegistry.close();
     }
     public Person get(int id) {
    	 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		 this.factory = config.buildSessionFactory(serviceRegistry); 
    	 this.session = factory.openSession(); 
	     this.t = session.beginTransaction();
    	 Person person = session.get(Person.class, id);
	     t.commit();
	     session.close();
	     factory.close();
	     serviceRegistry.close();
		 return person;
     }
}
