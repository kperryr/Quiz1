package quiz2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	public void CarpaymentTest() {
		CarPayment cp= new CarPayment(35000,0,60,.1);
		assertEquals(743.65,cp.monthlyPay(),2);
		assertEquals(9618.79,cp.totalInterestPay(),2);
		
	}


}

