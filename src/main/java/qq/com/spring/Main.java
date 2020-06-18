package qq.com.spring;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		
//		Hello hello=new Hello();
//		hello.setName("我爱你");
//		hello.hello();
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Hello hello=(Hello) applicationContext.getBean("hello");
		hello.hello();
		
		
	
		Car car =(Car) applicationContext.getBean("car");
		Car car1=(Car) applicationContext.getBean("car1");
		System.out.println(car);
		System.out.println(car1);
		
		Person person=(Person) applicationContext.getBean("person");
		System.out.println(person);
		
		Person person2=(Person) applicationContext.getBean("person2");
		System.out.println(person2);
		
		Person2 person22=(Person2) applicationContext.getBean("person3");
		System.out.println(person22);
		
		Person3 person3=(Person3) applicationContext.getBean("person4");
		System.out.println(person3);
		
		qq.com.spring.Properties properties=applicationContext.getBean(qq.com.spring.Properties.class);
		System.out.println(properties);
		
		Person2 person33=(Person2) applicationContext.getBean("person5");
		System.out.println(person33);
		
		Person2 person6=(Person2) applicationContext.getBean("person6");
		System.out.println(person6);
		
		
		String aString="www";
		if(!aString.equals("")) {
			System.out.println("------");
			if(aString.equals("11")) {
				System.out.println("------");
			}
			
		}
		
		
	}
}
