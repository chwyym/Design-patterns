package factory.FactoryMethod;

public class FacNYPizzaStore extends FacPizzaStore {

	// 상속을 받아 제품을 만듬
	@Override
	public FacPizza createPizza(String type) {
		FacPizza pizza = null;
		
		if(type.equals("FacCheesePizza")) {
			pizza = new FacCheesePizza();
		} else if(type.equals("FacClamPizza")) {
			pizza = new FacClamPizza();
		} else if(type.equals("FacPerpperoniPizza")) {
			pizza = new FacPerpperoniPizza();
		} else if(type.equals("FacVeggiePizza")) {
			pizza = new FacVeggiePizza();
		}
		
		return pizza;
	}

}
