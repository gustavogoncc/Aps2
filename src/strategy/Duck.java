package strategy;

public abstract  class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public duck() {
		
	}
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swin() {
		System.out.println("All ducks float, even decoys");
	}

}
