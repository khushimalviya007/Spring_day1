package com.springcore.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
@Primary
public class Iphone implements Demo{
	
	public void ringPhone() {
		
		System.out.println("Iphone Ringing.....");
	}

}
