package factory.AbstractFactory.store;

import factory.AbstractFactory.Ingredient.NyPizzaIngredintFactory;
import factory.AbstractFactory.Ingredient.PizzaIngredientFactory;
import factory.AbstractFactory.pizza.CheesePizza;
import factory.AbstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		//뉴욕 피자 성분 팩토리, 즉, 객체 구성을 통해 제품을 만듬
		PizzaIngredientFactory ingredientFactory = 
				new NyPizzaIngredintFactory();
		
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("뉴욕 치즈피자");
		}
		
		return pizza;
	}

}
