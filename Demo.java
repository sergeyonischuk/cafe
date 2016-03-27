package cafe;

public class Demo {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.generateMenu();
		menu.generateIngredients();
		
		
		menu.addProduct("CoffeeAaa", menu.ingredients[0], menu.ingredients[2]);
		menu.deleteProduct("Green Tea");
		menu.addProduct("CoffeeBbb", menu.ingredients[4], menu.ingredients[2]);
		menu.printMenu();

	}

}
