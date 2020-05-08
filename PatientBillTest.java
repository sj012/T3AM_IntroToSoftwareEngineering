import org.junit.Test;
import org.junit.Ignore;
//import static org.junit.Assert.*;
import org.junit.Assert;

public class PatientBillTest {
   

   private PatientBill getPatientBill(){
      String CustomerID = "100003";
      return new PatientBill(CustomerID);
   }
   
   @Test
   public void patient_bill_retrieved() {
      PatientBill patientbill = this.getPatientBill();
      patientbill.setCustomerInfo();
      System.out.println(patientbill.getPatientBill());
      
   
      
      
   }
   
   /*@Test(expected = IllegalArgumentException.class)
   public void Customer_ID_not_found(){
      PatientBill patientbill = this.getPatientBill();
      patientbill.setCustomerInfo();
      System.out.println(patientbill.getPatientBill());
   }*/
}
