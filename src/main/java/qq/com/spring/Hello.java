package qq.com.spring;

public class Hello {
	private String name;
	

	public void setName(String name) {
		this.name =name ;
		
	}
	
	public void hello() {
		System.out.println("hello+"+name);
	}
}
