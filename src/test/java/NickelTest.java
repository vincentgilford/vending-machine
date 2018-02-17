import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;

public class NickelTest {
	@Test
	public void getValueForNickel() {
		Nickel underTest = new Nickel();
		
		double check = underTest.getValue();
		assertThat(.05, is(check));
		
	}
	
	@Test
	public void assertNickelValueAttribute() {
		Nickel underTest = new Nickel();
		
		double check = .05;
		
		assertThat(check,is(underTest.getValue()));
		
		
		
	}
	
}
