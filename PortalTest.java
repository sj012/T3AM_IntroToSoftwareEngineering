package de.vogella.junit.first;

import org.junit.*;

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