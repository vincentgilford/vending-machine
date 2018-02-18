import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VendingMachine {

	
	private boolean isPresent; 
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


	public void itemIntake(Item...item) {
		// TODO Auto-generated method stub
		for(Item object : item) {
			items.put(object.getId(),object);
		}
		//for maintenance 
	}


	public Item itemInfo(String id) {
		// TODO Auto-generated method stub
		return items.get(id);
	}


	public void coinReturn() {
		// TODO Auto-generated method stub
		sum = 0; 
	}


	public void returnItem(String id) {
		items.get(id).removeQuantity();
		
	}


	public boolean isItemAvaliable(String id) {
		for(Item item : items.values()){
			if(item.getId().equals(id)) {
				if (item.getQuantity() > 0) {
					isPresent = true;
				} else {
					isPresent = false; 
				}
				
				isPresent = true;
			}
			 else {
				System.out.println("Item not in Vending Machine");
				 isPresent = false;
			}	
		}	
		return isPresent;
	}


	public void restockItems(String id, int intakeAmount) {
		for(Item item  : items.values()) {
			if(item.getId().equals(id)) {
				item.addQuantity(intakeAmount);
			}
		}
		
	}

	
	
}
