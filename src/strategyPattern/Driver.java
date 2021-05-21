package strategyPattern;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		MallardDuck mallardDuck = new MallardDuck("MallardDuck",4);
		RedheadDuck redheadDuck = new RedheadDuck("redHead duck", 0);
		
		
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.swim();
		
		redheadDuck.display();
		redheadDuck.quack();
		redheadDuck.swim();
		
	}
}
