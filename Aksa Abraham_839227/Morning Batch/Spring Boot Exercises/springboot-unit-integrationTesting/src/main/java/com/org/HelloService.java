package com.org;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String defaultMessage() {
		return "Welcome user";
	}
}