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
		// TODO Auto-generated method stub
		Iterator itr =items.values().iterator();
		while(itr.hasNext()) {
			Item object = (Item) itr.next();
			if (object.getId().equals(id)) {
				itr.remove();
			}		
		}
//		Set<Entry<String, Item>> entrySet = items.entrySet(); 
//		Iterator itr = entrySet.iterator();
//		while(itr.hasNext()) {
//			Map.Entry item = (Map.Entry) itr.next();
//			if (item.getKey().equals(id)) {
//				items.remove(item.getKey());
//			}
//		}
//		for(Item item : items.values()) {
//			if (item.getId().equals(id)) {
//				items.remove(item.getId());
//			}
//		}
	}


	public boolean isItemAvaliable(String id) {
		// TODO Auto-generated method stu		
		for(Item item : items.values()){
			if(item.getId().equals(id)) {
				isPresent = true; 
			} else {
				isPresent = false;
			}
			return isPresent;
		}
		
		return isPresent;
	}

	
	
}
