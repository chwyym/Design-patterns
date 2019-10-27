package strategy;

public class Test {
	public static void main(String[] args) {
		Duck mallared = new MallardDuck();
		mallared.performFly();
		mallared.performQuack();
		
		// 동적으로 행동을 지정
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
