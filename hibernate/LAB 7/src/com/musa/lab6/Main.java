package com.musa.lab6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int choice = 0;
				int id;
				String name;
				String fathername;
				String organization;
				String mobile;
				Person person;
				
				DBhandler app = new DBhandler();
				System.out.println("Menu {Save = 1; Delete = 2; Update = 3; Retrieve = 4}"); 
				Scanner input = new Scanner(System.in);
				choice = input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Stuendent ID?");
					id = input.nextInt();
					System.out.println("Stuendent name?");
					name = input.nextLine();
					name = input.nextLine();
					System.out.println("Stuendent fathername?");
					fathername = input.nextLine();
					System.out.println("Stuendent organization?");
					organization = input.nextLine();
					System.out.println("Stuendent mobile?");
					mobile = input.nextLine();
					person = new Person(id, name,fathername,organization,mobile);
					app.save(person);
					System.out.println("Student record added successfully!");
					break;
				case 2:
					System.out.println("Stuendent ID?");
					id = input.nextInt();
					app.delete(id);
					System.out.println("Student record delete successfully!");
					break;
				case 3:
					System.out.println("Stuendent ID?");
					id = input.nextInt();
					System.out.println("Stuendent name?");
					name = input.nextLine();
					name = input.nextLine();
					input.nextLine();
					System.out.println("Stuendent fathername?");
					fathername = input.nextLine();
					System.out.println("Stuendent organization?");
					organization = input.nextLine();
					System.out.println("Stuendent mobile?");
					mobile = input.nextLine();
					person = new Person(id, name,fathername,organization,mobile);
					app.update(person);
					System.out.println("Student record updated successfully!");
					break;
				case 4:
					System.out.println("Stuendent ID?");
					id = input.nextInt();
					Person per = app.get(id);
					System.out.println("id: "+per.getId()+" Name: "+per.getName()+" Fathers Name: "+per.getFathername()+
							" Organization: "+per.getOrganization()+" Mobile Number: "+per.getMobile()+"\n");
					System.out.println("Student record retrieved successfully!");
					break;
				default:
					System.out.println("Invalid choice");
					input.close();
			}
		
	}
}
