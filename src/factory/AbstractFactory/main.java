package factory.AbstractFactory;

import factory.AbstractFactory.store.NYPizzaStore;
import factory.AbstractFactory.store.PizzaStore;

public class main {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
	}
}
