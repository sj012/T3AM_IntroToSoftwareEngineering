//package de.vogella.junit.first;

import org.junit.*;

/**
* This is the test file for Bill.java. It runs one test, which checks whether or 
* not the api connection is succesful.
* <p>
* This method either returns the result of whether or not the getUrlInfo() method
* of Bill.java matches the asert as the string F1. Otherwise it returns nothing
*
* @param  Bill bill: A Bill object.
* @param  String results: the String that contains the result of the getUrlInfo()
* method.
* @return A string of "F1", which notifies the Test Runner that the connection failed.
*/

public class BillTest{

	private Bill getBill(){
		return new Bill();
	}
	
	@Test
	public void test_if_api_connection_successful(){
		Bill bill = this.getBill();
		String result = bill.getUrlInfo();
    	Assert.assertNotEquals(result, "F1");
	}
}
