package qq.com.spring;

public class Person {

	private String name;
	private String age;
	private Car car;
	
	
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


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}


	public Person(String name, String age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	
	
}
