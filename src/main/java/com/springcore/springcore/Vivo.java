package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component
public class Vivo implements Demo {

	public void ringPhone() {
		System.out.println("Vivo is Ringing.......");
	}
}
