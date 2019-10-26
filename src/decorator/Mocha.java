package decorator;
/**
 * 데코레이터
 * @author CHW
 */
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.description + ", 모카";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
