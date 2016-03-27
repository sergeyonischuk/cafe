package cafe;

public class Product {
	
	private String prodName;
	private Ingredient[] ingredient;
	
	public Product(String name, Ingredient ... ingredient){
		this.prodName = name;
		this.ingredient = ingredient;
	}
	
	public Product(){
		
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public Ingredient[] getIngredient() {
		return ingredient;
	}


	public void setIngredient(Ingredient[] ingredient) {
		this.ingredient = ingredient;
	}
	

}
