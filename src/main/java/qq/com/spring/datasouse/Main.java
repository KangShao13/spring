package qq.com.spring.datasouse;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import qq.com.spring.autowie.Car;
import qq.com.spring.autowie.Person;

/**
 * @author kang
 *
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("datasouse.xml");
		DataSource dataSources=(DataSource) applicationContext.getBean("datasouse");
		System.out.println(dataSources);
	} 
}
