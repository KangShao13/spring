package qq.com.spring;

public class Car {

	private String name;
	private String factory;
	private int maxbit;
	private double pay;
	
	public Car(String name, String factory, int maxbit) {
		super();
		this.name = name;
		this.factory = factory;
		this.maxbit = maxbit;
	}
	public Car(String name, String factory, double pay) {
		super();
		this.name = name;
		this.factory = factory;
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", factory=" + factory + ", maxbit=" + maxbit + ", pay=" + pay + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxbit() {
		return maxbit;
	}
	public void setMaxbit(int maxbit) {
		this.maxbit = maxbit;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String factory, int maxbit, double pay) {
		super();
		this.name = name;
		this.factory = factory;
		this.maxbit = maxbit;
		this.pay = pay;
	}
	
	
	//提交第一次
	
}
