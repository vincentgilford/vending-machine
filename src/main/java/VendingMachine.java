import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

	
	private double sum = 0;

	Map<String,Item> items = new HashMap<String,Item>(); 
	

	public double amountInserted() {
		// TODO Auto-generated method stub
		return sum;
	}


	public void coinInsert(Money...money) {
		// TODO Auto-generated method stub
		for (Money cash : money) {
			 sum += cash.getValue();	
		}
	}


	public void itemIntake(Item item) {
		// TODO Auto-generated method stub
		items.put(item.getId(), item);
	}


	public Item itemInfo(String id) {
		// TODO Auto-generated method stub
		return items.get(id);
	}

	
	
}
