package com.in28minutes.learnspringframework.hello;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunnerTightCoupled;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.hello.HelloWorldConfiguration.Address;

public class HelloWorldWithSpring {

	public static void main(String[] args) {

		// 1: launch a spring context , this will hold the beans inside the jvm, the spring context is also called ioc container, spring container, application context
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) { // this is called try with a resources , its will close the resources
			                                                                                        // in this case the context at the end or in case of an exception
		// 2: configure the things we want Spring to manage - @Configuration
        // the @Configuration in our case is HelloWorldConfiguration.class
		// Bean - name
		 
		 // here we retrieve the name which is the function name which is annotated with the @Bean
		 System.out.println(context.getBean("name"));
		 System.out.println(context.getBean("age"));
		 System.out.println(context.getBean("person"));
		 System.out.println(context.getBean("direccion"));
		 System.out.println(context.getBean(Address.class));// we can also call the bean by the return type of the bean method , having this causes: expected single matching bean but found 2: direccion,address2
		 // but to prevent this we have to define a @primary bean in the configuration
		 System.out.println(context.getBean("person2ByMethodCall"));
		 System.out.println(context.getBean("person3ByParameters"));
		 System.out.println(context.getBean("person4ByQualifier"));

		 
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);// this command print all the spring beans we had defined so far 
		 
		
		}
	}

}
