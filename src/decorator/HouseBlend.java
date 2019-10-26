package decorator;
/**
 * 구상 구성요소
 * @author CHW
 */
public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "하우스 블랜드 커피";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}
}
