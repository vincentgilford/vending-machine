import java.util.ArrayList;

public class VendingMachine {

	
	
	
	private double sum;


	public double amountInserted() {
		// TODO Auto-generated method stub
		return sum;
	}


	public void coinInsert(Money money) {
		// TODO Auto-generated method stub
		  sum = money.getValue();
	}

	
	
}
