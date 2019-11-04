package factory.AbstractFactory.store;

import factory.AbstractFactory.pizza.Pizza;

public abstract class PizzaStore {
	public abstract Pizza createPizza(String type);
	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
