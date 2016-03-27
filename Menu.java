package cafe;

public class Menu {
	Ingredient ingredient = new Ingredient();
	Product product = new Product();
	public int ingrPositions = 100;
	public int prodPositions = 100;
	public Product[] menu = new Product[prodPositions];
	public Ingredient[] ingredients = new Ingredient[ingrPositions];
	
	
	public void generateIngredients(){
		ingredients[0] = new Ingredient("water", 1);
		ingredients[1] = new Ingredient("black tea", 5);
		ingredients[2] = new Ingredient("green tea", 5);
		ingredients[3] = new Ingredient("bergamot tea", 5);
		ingredients[4] = new Ingredient("coffee", 7);
		ingredients[5] = new Ingredient("sugar", 1);
		ingredients[6] = new Ingredient("milk", 3);
		ingredients[7] = new Ingredient("cacao", 4);
	
		}
		
	public void generateMenu(){
			
		menu[0] = new Product("Black Tea", ingredients[0], ingredients[1], ingredients[5]);
		menu[1] = new Product("Green Tea", ingredients[0], ingredients[2], ingredients[5]);
		menu[2] = new Product("Bergamot Tea", ingredients[0], ingredients[3], ingredients[5]);
		menu[3] = new Product("Espresso", ingredients[0], ingredients[4], ingredients[5]);
		menu[4] = new Product("Americano", ingredients[0], ingredients[4], ingredients[5]);
		menu[5] = new Product("Cappuccino", ingredients[0], ingredients[4], ingredients[5], ingredients[6]);
		menu[6] = new Product("Mocaccino", ingredients[0], ingredients[4], ingredients[5], ingredients[6], ingredients[7]);
		menu[7] = new Product("ads", ingredients[1]);
		}
	
		
	public void printMenu(){
		for(int i = 0; menu[i] != null; i++){
		System.out.println(menu[i].getProdName() + ". Price: " /** КАААААК? **/);

		}
		
	}
	
		
		public void addIngredient(String name, int price){
			if(ingredients.length == ingrPositions - 2){
				ingrPositions += ingrPositions / 100 * 25;
				generateIngredients();
			}
			for(int i = 0; i < ingrPositions; i++){
				if(ingredients[i] == null){
					ingredients[i] = new Ingredient(name, price);
					break;
				}
			}
			
		}
		
		public void deleteIngredient(String name){
			for(int i = 0; i < ingrPositions; i++){
				if(name.equals(ingredients[i].getName())){
					ingredients[i] = null;
					break;
				}
			}
		}
		
		

		public void addProduct(String name, Ingredient ... ingredient){
			if(menu.length == prodPositions - 2){
				prodPositions += prodPositions / 100 * 25;
				generateMenu();
			}
			for(int i = 0; i < prodPositions; i++){
				if(menu[i] == null){
					menu[i] = new Product(name, ingredient);
					break;
				}
			}
			
		}
		
		
		public void deleteProduct(String name){
			for(int i = 0; i < prodPositions; i++){
				if(name.equals(menu[i].getProdName())){
					menu[i] = null;
					break;
				}
			}
		}
		
		

}
