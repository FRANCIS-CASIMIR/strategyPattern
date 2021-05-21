package strategyPattern;

public class MallardDuck extends Duck {

	public MallardDuck(String name, int age) {
		super(name, age);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is a Mallard Duck and it is "+this.age+" Years old");
	}

}
