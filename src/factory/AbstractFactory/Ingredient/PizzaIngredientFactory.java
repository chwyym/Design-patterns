package factory.AbstractFactory.Ingredient;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
}
