package FIZZBUZZ.test;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class Fizzbuzz {

	@Test
	public void tests(){ 
		  Fiz fb = new Fiz(); 
		  for(int i=1; i<=100; i++){ 
		    System.out.println(fb.convert(i)); 
		  } 
		}

}
