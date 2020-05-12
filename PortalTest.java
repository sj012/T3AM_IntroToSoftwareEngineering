package de.vogella.junit.first;

import org.junit.*;

/**
* This is the test file for Portal.java. It runs one test, which checks whether or 
* not the api connection is succesful.
* <p>
* This method either returns the result of whether or not the getUrlInfo() method
* of Portal.java matches the asert as the string F1. Otherwise it returns nothing
*
* @param  Portal: A Portal object.
* @param  String results: the String that contains the result of the getUrlInfo()
* method.
* @return A string of "F1", which notifies the Test Runner that the connection failed.
*/

public class PortalTest{
	/*
	Returns new instance of Portal.
	*/
	private Portal getPortal(){
		return new Portal();
	}
	
	@Test
	public void test_if_api_connection_successful(){
		Portal portal = this.getPortall();
		String result = portal.getUrlInfo();
    	Assert.assertNotEquals(result, "F1");
	}
}