package strategyPattern;

public abstract class Duck {
	
	protected String name;
	protected int age;
	
	public Duck(String name,int age){
		
		this.name = name;
		this.age = age;
	}
	
	public void quack() {
		System.out.print(this.name+" Quacking..");
	}
	
	public void swim() {
		System.out.println(this.name+" Swimming");
	}
	
	public abstract void display();
}
