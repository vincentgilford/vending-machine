import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class VendingMachinTest {
	private VendingMachine underTest;
	private Dime dime;
	private Nickel nickel;
	
	@Before
	public void setup() {
		underTest = new VendingMachine(); 
		dime = new Dime();
		nickel = new Nickel(); 
	}
	
	
	
	@Test
	public void assertThatAbilityToTakeRecieveNickel() {
		VendingMachine underTest = new VendingMachine(); 
		Nickel nickel = new Nickel();
		underTest.coinInsert(nickel);

		double check = underTest.amountInserted();
		
		assertThat(.05, is(check));
	}

	@Test
	public void dimeObjectInsertedIntoVending() {
		Dime dime = new Dime(); 
		
		underTest.coinInsert(dime);
		underTest.amountInserted();
		double check = .10; 

		assertThat(check, is(underTest.amountInserted()));
	}
	
	@Test
	public void nickelAndDimeInsert() {
		underTest.coinInsert(dime);
		underTest.coinInsert(nickel);
		
		
		underTest.amountInserted();
		
		double check = .15; 
		
		assertEquals(check, (underTest.amountInserted()),.001); 
	}
	
	@Test
	public void nickelAndDimeSimulatenousInsert() {
		underTest.coinInsert(nickel,dime);
		
		double check = .15;
		
		assertEquals(check, (underTest.amountInserted()),.001);
		
		
	}
	
	
	
	
	
	
//	@Test
//	public void nickelObjectInseretedIntoMaching() {
//		Nickel nickel = new Nickel(); 
//		underTest.coinInsert(nickel);
//		
//		double check = .05;
//		
//		assertThat(check, is(underTest.amountInserted()));
//		
//		
//	}
	
//	@Test
//	public void assertAbilityToRecieveDime() {
//		VendingMachine underTest = new VendingMachine();
//		
//		underTest.coinInserted();
//		
//		double check = underTest.amountInserted();
//		
//		assertThat(.10,is(check));
//		
//	}
}
