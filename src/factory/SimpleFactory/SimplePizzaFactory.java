package factory.SimpleFactory;

public class SimplePizzaFactory {
	public SimPizza createPizza(String type) {
		SimPizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new SimCheesePizza();
		} else if(type.equals("pepperoni")) {
			pizza = new SimPepperoniPizza();
		} else if(type.equals("clam")) {
			pizza = new SimClamPizza();
		}
		
		return pizza;				
	}
}
