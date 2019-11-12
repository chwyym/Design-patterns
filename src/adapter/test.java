package adapter;

public class test {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("turkey...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nduck...");
		duck.quack();
		duck.fly();
		
		System.out.println("\nturkeyAdapter");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
	}
}
