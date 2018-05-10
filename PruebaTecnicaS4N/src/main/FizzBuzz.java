package main;

public class FizzBuzz {
	
	private static final Integer UNO = 1;
	private static final Integer CIEN = 100;

	public static String identificarFizzBuzz(Integer i) {
		String numeroFizzBuzz = "";
		numeroFizzBuzz = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : ""); 
		
		return numeroFizzBuzz.isEmpty() ? i.toString() : numeroFizzBuzz;
	}

	public static void main(String[] args) {
		for (Integer i = UNO; i <= CIEN; i++) {
			System.out.println(FizzBuzz.identificarFizzBuzz(i));
		}
	}
}
