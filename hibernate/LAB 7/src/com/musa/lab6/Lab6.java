package com.musa.lab6;

public class Lab6 {
	public static void main(String[] args) {
		Configuration config = new Configuration("config.properties");
		Connector con = new Connector(config);
		DBHandler db = new DBHandler(con);
		
		
		Person p1= new Person();
		p1.setFirstname("Musa");
		p1.setLastname("Zahid");
		p1.setPhone("131236637746");
		
		Person p2 = new Person();
		p2.setFirstname("Mustafa");
		p2.setLastname("Kamal");
		p2.setPhone("88362283943");
		
		Person p3 = new Person();
		p3.setFirstname("Muhammad");
		p3.setLastname("Ali");
		p3.setPhone("13214941943");
		
		db.update(p2, 1);
		db.create(p2);
		db.create(p3);
		db.delete(1);
		db.getAll();
		db.get(2);
		
	}
}
