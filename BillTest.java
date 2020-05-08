package de.vogella.junit.first;

import org.junit.*;

public class BillTest{
	/*
	Returns new instance of Bill.
	*/
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