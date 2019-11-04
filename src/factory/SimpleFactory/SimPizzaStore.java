package factory.SimpleFactory;

public class SimPizzaStore {
	SimplePizzaFactory factory;
	
	public SimPizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public SimPizza orderPizza(String type) {
		SimPizza pizza = factory.createPizza(type);
		
		// 피자 주문 프로세스
		
		return pizza;
	}
}
