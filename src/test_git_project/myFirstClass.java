package test_git_project;

public class myFirstClass {

	private String hello;
	private String hello1;
	
	
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getHello1() {
		return hello1;
	}
	public void setHello1(String hello1) {
		this.hello1 = hello1;
	}
	
	@Override
	public String toString() {
		return "myFirstClass [hello=" + hello + ", hello1=" + hello1 + "]";
	}
	
}
