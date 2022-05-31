package com.raquel.json;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User_> users = new ArrayList<User_>();
		
		users.add(new User_(123l, "Raquel", "Diaz", "cat1", 1000f));
		users.add(new User_(122l, "Juan", "Garcia", "cat2", 2000f));
		users.add(new User_(121l, "Pablo", "Lopez", "cat3", 3000f));
		users.add(new User_(120l, "Sergio", "Hernandez", "cat2", 4000f));
		users.add(new User_(128l, "Paula", "Carrasco", "cat1", 5000f));
		System.out.println(users);
		
		for (int i=0; i<users.size(); i++) {
			System.out.println(users.get(i).recalcularSueldo());
		}
	}
			
	
	
}
		
		
		