package decorator;
/**
 * 추상 데코레이터
 * Beverage - 구상 구성요소를 감싸기 위해 선언
 * @author CHW
 */
public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
	
}
