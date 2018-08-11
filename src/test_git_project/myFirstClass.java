package test_git_project;

public class myFirstClass {

	private String hello;
	private String hello2;
	private String hello3;
	private String hello34;
	private String hello35;
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getHello2() {
		return hello2;
	}
	public void setHello1(String hello1) {
		this.hello2 = hello1;
	}
	
	@Override
	public String toString() {
		return "myFirstClass [hello=" + hello + ", hello1=" + hello2 + "]";
	}
	
}
