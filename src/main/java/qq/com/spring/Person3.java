package qq.com.spring;

import java.util.List;
import java.util.Map;

public class Person3 {

	
	private String name;
	private String age;
	private Map<String , Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	public Person3(String name, String age, Map<String, Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	public Person3() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person3 [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
	
}
