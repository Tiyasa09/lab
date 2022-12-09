package com.demo.main;
//problem statement 2
//test even odd in junit
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnit_EvenOdd {  //class
	public static boolean evenOdd(int a) {  //method
		if(a%2==0) { //condition for even
			return true;
		}else {
			return false;
		}
	}

}

