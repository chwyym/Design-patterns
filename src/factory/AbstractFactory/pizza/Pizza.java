package factory.AbstractFactory.pizza;

import factory.AbstractFactory.Ingredient.Dough;
import factory.AbstractFactory.Ingredient.Sauce;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	
	public abstract void prepare();
		
	public void bake() {
		System.out.println("빵 굽는 중");
	}
	
	public void cut() {
		System.out.println("피자 자르는 중");
	}
	
	public void box() {
		System.out.println("피자 포장 중");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
