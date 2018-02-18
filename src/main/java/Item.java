
public class Item {


	private String vendingId;
	private String name;
	private double price;
	private int quantity;



	public Item(String vendingId, String name, double price) {
		this.vendingId = vendingId;
		this.name = name;
		this.price = price;
		// TODO Auto-generated constructor stub
	}



	public Item(String vendingId, String name, double price, int quantity) {
		// TODO Auto-generated constructor stub
		this.vendingId = vendingId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}



	public String getId() {
		// TODO Auto-generated method stub
		return vendingId
				;
	}



	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}



	public void removeQuantity() {
		// TODO Auto-generated method stub
		quantity--;
	}



	public void addQuantity(int intakeAmount) {
		// TODO Auto-generated method stub
		quantity += intakeAmount;
	}

}
