import java.util.ArrayList;

public class VendingMachine {

	
	
	
	private double sum = 0;


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

	
	
}
