package com.concretepage;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPTest {
   public static void main(String[] args) {
	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
       ctx.register(AspectConfig.class);
       ctx.refresh();
       UserService userService = ctx.getBean(UserService.class);
       userService.doTask();
               
   }

} 