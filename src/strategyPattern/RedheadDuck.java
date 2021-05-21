package strategyPattern;

public class RedheadDuck extends Duck {

	public RedheadDuck(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is a Redhead Duck and it is "+this.age+" Years old");
	}

}
