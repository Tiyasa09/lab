package com.demo.main;
//problem statement 2
//test even odd in junit
import static org.junit.Assert.assertEquals;

import org.junit.Test;

class EvenOdd {  //class
	public static boolean evenOdd(int a) {  //method
		if(a%2==0) { //condition for even
			return true;
		}else {
			return false;
		}
	}

}
public class JUnit_EvenOdd{
	@Test
	public void testing() {
		//testing
		assertEquals(true,EvenOdd.evenOdd(30));
		assertEquals(true,EvenOdd.evenOdd(38));
	}
}
