
public class Dog {
	public String breed;
	public String color;
	protected int age;
	private String name;
	
	public void bowwow() {
		System.out.println("멍멍 짖다");
	}
	
	protected void run() {
		System.out.println("달리다");
	}
	
	private void sleep() {
		System.out.println("잠을 자다");
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
