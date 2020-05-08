package de.vogella.junit.first;
import org.junit.*;

public class PortalTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(PortalTest.class);
		
			if (result.getFailures().size() > 0){
    		System.err.println("A unit test failed:");
        		for (Failure failure : result.getFailures()) {
            	System.err.println("\t" + failure.toString());
        		}
        	System.exit(1);
    		}
    	System.out.println("No errors detected in run.");
    	System.exit(1);
	}
}