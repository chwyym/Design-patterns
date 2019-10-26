package decorator;
/**
 * 추상 구성요소
 * @author CHW
 */
public abstract class Beverage {
	String description = "제목 없음";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
