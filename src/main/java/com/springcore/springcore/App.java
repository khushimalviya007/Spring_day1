package com.springcore.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{

    public static void main( String[] args )
    {	
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Mobile obj = (Mobile) context.getBean("mobile");
        obj.d.ringPhone();
    }
}
  