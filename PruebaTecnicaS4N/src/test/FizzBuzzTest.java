package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import main.FizzBuzz;

public class FizzBuzzTest {
	
	private static final Integer TRES = 3;
	private static final Integer VEINTIUNO = 21;
	private static final Integer CINCO = 5;
	private static final Integer CINCUENTA = 50;
	private static final Integer QUINCE = 15;
	private static final Integer SESENTA = 60;
	private static final Integer UNO = 1;
	private static final Integer SETENTAYSIETE = 77;

	@Test
	public void esDivisibleEntreTresImprimeFizz(){
		assertEquals("Fizz", FizzBuzz.identificarFizzBuzz(TRES));
		assertEquals("Fizz", FizzBuzz.identificarFizzBuzz(VEINTIUNO));
	}
	
	@Test
	public void noEsDivisibleEntreTresNoImprimeFizz(){
		assertNotEquals("Fizz", FizzBuzz.identificarFizzBuzz(CINCO));
		assertNotEquals("Fizz", FizzBuzz.identificarFizzBuzz(SETENTAYSIETE));
	}
	
	@Test
	public void esDivisibleEntreCincoImprimeBuzz(){
		assertEquals("Buzz", FizzBuzz.identificarFizzBuzz(CINCO));
		assertEquals("Buzz", FizzBuzz.identificarFizzBuzz(CINCUENTA));
	}
	
	@Test
	public void noEsDivisibleEntreCincoNoImprimeBuzz(){
		assertNotEquals("Buzz", FizzBuzz.identificarFizzBuzz(TRES));
		assertNotEquals("Buzz", FizzBuzz.identificarFizzBuzz(SETENTAYSIETE));
	}
	
	@Test
	public void esDivisibleEntreTresYCincoImprimeFizzBuzz(){
		assertEquals("FizzBuzz", FizzBuzz.identificarFizzBuzz(QUINCE));
		assertEquals("FizzBuzz", FizzBuzz.identificarFizzBuzz(SESENTA));
	}
	
	@Test
	public void noEsDivisibleEntreTresYCincoNoImprimeFizzBuzz(){
		assertNotEquals("FizzBuzz", FizzBuzz.identificarFizzBuzz(UNO));
		assertNotEquals("FizzBuzz", FizzBuzz.identificarFizzBuzz(VEINTIUNO));
	}
	
	@Test
	public void noEsDivisibleEntreTresYCincoImprimeNumero(){
		assertEquals("1", FizzBuzz.identificarFizzBuzz(UNO));
		assertEquals("77", FizzBuzz.identificarFizzBuzz(SETENTAYSIETE));
	}
	
	@Test
	public void esDivisibleEntreTresYCincoNoImprimeNumero(){
		assertNotEquals("1", FizzBuzz.identificarFizzBuzz(QUINCE));
		assertNotEquals("77", FizzBuzz.identificarFizzBuzz(SESENTA));
	}
}
