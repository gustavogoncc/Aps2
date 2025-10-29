package strategy;

public class MiniDuckSimulator {
	public static void main(String[]args) {
		Duck model = new ModelDuck();
		model.performFly();
		model.seFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flybehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
