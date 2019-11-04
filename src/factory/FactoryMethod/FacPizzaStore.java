package factory.FactoryMethod;

public abstract class FacPizzaStore {
	
	public FacPizza orderPizza(String type) {
		FacPizza pizza = this.createPizza(type);
		
		pizza.back();
		pizza.box();
		pizza.cut();
		
		return pizza;
	}
	
	public abstract FacPizza createPizza(String type);
}
