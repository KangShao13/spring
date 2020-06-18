package qq.com.spring;

import java.util.List;

public class Person2 {

	private String name;
	private String age;
	private List<Car> cars;
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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
	
}
