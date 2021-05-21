package behaviorImplementation;

import behavior.Flyable;

public class FlyNormally implements Flyable {

	@Override
	public void fly() {
		System.out.println("Flying normally");
	}

}
