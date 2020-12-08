package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		 list.add(new User(100, "Ratna", "ratna@1998"));
		 list.add(new User(120, "Akshaya", "unique123"));
		 list.add(new User(101, "Prerna", "earth789"));
		 list.add(new User(105, "Suraj", "suraj@345"));
		 list.add(new User(130, "Pragathi", "coder987"));

		for(User s: list)
		 {
		if(s.getName().length() >5){
		 
		System.out.println(s.getName());
		}

		}


	}

}
