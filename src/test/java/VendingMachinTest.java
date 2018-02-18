import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.contains;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class VendingMachinTest {
	private VendingMachine underTest;
	private Dime dime;
	private Nickel nickel;
	private Quarter quarter;
	Dollar dollar;
	Item item;
	Item anotherItem;

	@Before
	public void setup() {
		underTest = new VendingMachine();
		dime = new Dime();
		nickel = new Nickel();
		quarter = new Quarter();
		dollar = new Dollar();
		item = new Item("A1", "Gummies", 1.00,1);
		anotherItem = new Item("B1", "Chips", .75,1);
	
	}
//
//	@Test
//	public void assertThatAbilityToTakeRecieveNickel() {
//		VendingMachine underTest = new VendingMachine();
//		Nickel nickel = new Nickel();
//		underTest.coinInsert(nickel);
//		double check = underTest.amountInserted();
//
//		assertThat(.05, is(check));
//	}
//
//	@Test
//	public void dimeObjectInsertedIntoVending() {
//		Dime dime = new Dime();
//
//		underTest.coinInsert(dime);
//		underTest.amountInserted();
//		double check = .10;
//
//		assertThat(check, is(underTest.amountInserted()));
//	}
//
//	@Test
//	public void nickelAndDimeInsert() {
//		underTest.coinInsert(dime);
//		underTest.coinInsert(nickel);
//
//		underTest.amountInserted();
//
//		double check = .15;
//
//		assertEquals(check, (underTest.amountInserted()), .001);
//	}
//
//	@Test
//	public void nickelAndDimeSimulatenousInsert() {
//		underTest.coinInsert(nickel, dime);
//
//		double check = .15;
//
//		assertEquals(check, (underTest.amountInserted()), .001);
//	}
//
//	@Test
//	public void vendingMachineInsertQuarter() {
//		Quarter quarter = new Quarter();
//		underTest.coinInsert(quarter);
//
//		double check = .25;
//
//		assertEquals(check, (underTest.amountInserted()), .001);
//
//	}
//
//	@Test
//	public void vendingMachineInsertDollar() {
//		Dollar dollar = new Dollar();
//
//		underTest.coinInsert(dollar);
//
//		double check = 1.00;
//
//		assertEquals(check, (underTest.amountInserted()), .001);
//
//	}
//
//	@Test
//	public void addingADollarTwentyFive() {
//		underTest.coinInsert(quarter, dollar);
//
//		double check = 1.25;
//
//		assertEquals(check, underTest.amountInserted(), .001);
//
//	}
//
//	@Test
//	public void addingFiftyCents() {
//		underTest.coinInsert(quarter, quarter);
//		double check = .50;
//
//		assertEquals(check, underTest.amountInserted(), .001);
//	}
//
//	@Test
//	public void addingADollarAndTenCents() {
//		underTest.coinInsert(quarter, quarter, quarter, quarter, dime);
//
//		double check = 1.10;
//
//		assertEquals(check, underTest.amountInserted(), .001);
//
//	}
//
//	@Test
//	public void vendingMachineContainsItem() {
//		Item item = new Item("A1", "Gummies", 1.00);
//
//		underTest.itemIntake(item);
//
//		Item check = underTest.itemInfo(item.getId());
//
//		assertThat(check, is(underTest.itemInfo(item.getId())));
//	}
//
//	@Test
//	public void vendingMachineIntakeWithTwoItems() {
//		Item item = new Item("A1", "Gummies", 1.00);
//		Item anotherItem = new Item("B1", "Chips", .75);
//
//		underTest.itemIntake(anotherItem, item);
//
//		Item check = underTest.itemInfo(item.getId());
//		Item checkNextItem = underTest.itemInfo(anotherItem.getId());
//
//		assertThat(check, is(underTest.itemInfo(item.getId())));
//		assertThat(checkNextItem, is(underTest.itemInfo(anotherItem.getId())));
//	}
//
//	@Test
//	public void coinReturnForVendingMachine() {
//		underTest.coinInsert(quarter,quarter);	
//		double checkBefore = underTest.amountInserted();
//		
//		
//		underTest.coinReturn(); 
//		double checkAfter = underTest.amountInserted();
//	
//		assertEquals(checkBefore, .50, .001);
//		assertNotEquals(checkBefore, checkAfter, .001);		
//	}
//
//	
//	
//	@Test
//	public void vendItemBasedOfPrice() {
//		underTest.itemIntake(item,anotherItem);
//		underTest.returnItem(item.getId());
//		boolean check = underTest.isItemAvaliable(item.getId());
//		assertEquals(check, false);
//	}
//	
//	@Test
//	public void vendItemBasedOfPriceDeux() {
//		underTest.itemIntake(item,anotherItem);
//		underTest.returnItem(anotherItem.getId());
//		boolean check = underTest.isItemAvaliable(anotherItem.getId());
//		assertEquals(check,false);
//	}
//	
//	@Test
//	public void itemQuantityForInventory() {
//		Item addItemQuant = new Item("C1","Honey Bun",1.00,1);
//		underTest.itemIntake(addItemQuant);
//		boolean check = underTest.isItemAvaliable(addItemQuant.getId()); 
//	
//		assertEquals(check, true);
//	}
//	
//	@Test
//	public void returnItemMethodFuncitonalChange() {
//		underTest.itemIntake(item,anotherItem);
//		underTest.returnItem(anotherItem.getId());
//		boolean check = underTest.isItemAvaliable(anotherItem.getId());
//		assertEquals(check, false); 
//		
//	}
//	
//	@Test
//	public void returnItemMethodTestTwo() {
//		Item addItemQuant = new Item("C1","Honey Bun",1.00,0);
//		
//		underTest.itemIntake(item,anotherItem, addItemQuant);
//		boolean check = underTest.isItemAvaliable(addItemQuant.getId());
//		
//		assertEquals(check, false); 
//	}
//	
	@Test
	public void vendingMachineReStock() {
		Item addItemQuant = new Item("C1","Honey Bun",1.00,1);
		Item itemAddTest = new Item("D1","Snickers",.75,1);
		underTest.itemIntake(addItemQuant,item,anotherItem);
	
//		boolean checkBefore = underTest.isItemAvaliable(addItemQuant.getId());//false
//		underTest.restockItems(addItemQuant.getId(),2);
		boolean checkAfter = underTest.isItemAvaliable(addItemQuant.getId());//true
		assertEquals(checkAfter, true);
	}//problem with itemIntake method cannot add more than 3 need to relook
	
	
	
	// @Test
	// public void nickelObjectInseretedIntoMaching() {
	// Nickel nickel = new Nickel();
	// underTest.coinInsert(nickel);
	//
	// double check = .05;
	//
	// assertThat(check, is(underTest.amountInserted()));
	//
	//
	// }

	// @Test
	// public void assertAbilityToRecieveDime() {
	// VendingMachine underTest = new VendingMachine();
	//
	// underTest.coinInserted();
	//
	// double check = underTest.amountInserted();
	//
	// assertThat(.10,is(check));
	//
	// }
}
