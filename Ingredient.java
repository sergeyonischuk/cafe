package cafe;

public class Ingredient {
	
	private String name;
	private int price;
	
	public Ingredient(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public Ingredient(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
