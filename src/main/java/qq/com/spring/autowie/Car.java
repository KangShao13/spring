package qq.com.spring.autowie;

public class Car {

	private String name;
	private String pay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", pay=" + pay + "]";
	}
	public Car() {
		System.out.println("创建了-------");
		
		// TODO Auto-generated constructor stub
	}
	
	
}
