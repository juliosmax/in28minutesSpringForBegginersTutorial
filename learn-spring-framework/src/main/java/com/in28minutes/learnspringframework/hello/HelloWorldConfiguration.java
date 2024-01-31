package com.in28minutes.learnspringframework.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learnspringframework.hello.HelloWorldConfiguration.Address;

@Configuration
public class HelloWorldConfiguration {
	
	record Person(String name, int age, Address address) {}; // this is a shortcut to create a class, this is a new feature since java 16
	
	record Address(String calle, String city) {} ;

	@Bean  //this annotation Indicates that a method produces a bean to be managed by the Spring container. 
	public String name() {
		return "Sean";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean 
	public Person person() {
		var persona = new Person("Juan",20, new Address("5 calle","El tunco"));
		return persona;
	}
	
	 @Bean("direccion")  //by default the name of the bean is the name of the method , but if we want to customize the name we can change the name and send it as a parameter in the @Bean
	 @Primary  // this annotation makes the primary bean , because it could collide with address2() if it is called context.getBean(Address.class) this way 
	 public Address address() {
		 return new Address("3 era calle","Guate");
	 }
	 
	 @Bean
	 @Qualifier("address2Qualifier") // this is another form to name a bean and use it to invoke it and differentiate from the others
	 public Address address2() {
		 return new Address("av reforma","Mexique");
	 }
	 
	 @Bean  // here we use existing beans to create another bean
	 public Person person2ByMethodCall() {
		 return new Person(name(),age(), address());
	 }
	
	 @Bean  // here we use the name of the beans as a parameters to create a new bean
	 public Person person3ByParameters(String name, int age, Address direccion) {
		 return new Person(name,age,direccion);
	 }
	 
	 @Bean  // here we use the name of the beans as a parameters to create a new bean
	 public Person person4ByQualifier(String name, int age,@Qualifier("address2Qualifier") Address direccion) {
		 return new Person(name,age,direccion);
	 }
	 
}
