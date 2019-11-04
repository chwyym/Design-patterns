package factory.AbstractFactory.Ingredient;

public class NyPizzaIngredintFactory implements PizzaIngredientFactory{
		
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new  MarinaraSauce();
	}

}
