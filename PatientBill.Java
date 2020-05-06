import java.util.List;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.util.ArrayList;




public class PatientBill{
    private String customerID; 
    private String pbill;
    private String billstring;
  public PatientBill(String customerID){
      this.customerID = customerID;
      Bill bill = new Bill();
      billstring = bill.getUrlInfo;
  }
  public String getPatientBill(){
      return pbill;
  }
   private void setCustomerInfo(){
    //Make pbill an ArrayList   
       
   } 
           

            
}
 
