//import org.junit.*;

public class PatientBillTest {
   
  
   
   // "patientBilling": [ { "date": "2019-01-01", "amount": 100.0, "customer_id": 100003, "service": "Annual Checkup", "patient_id": 99989 }, { "date": "2020-01-29", "amount": 105.0, "customer_id":
  
   private PatientBill getPatientBill(){
      String CustomerID = "100003";
      return new PatientBill(CustomerID);
   }
   
   @Test
   public void patient_bill_retrieved() {
     PatientBill patientBill = this.getPatientBill();
		String result = patientBill.setCustomerInfo();
    	Assert.assertNotEquals(result, "" );
      
   
      
      
   }
   
 
}
