import java.util.List;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;



public class PatientBill{
    private String customerID; 
    private String pbill;
    private String billstring;
   
  public PatientBill(String customerID){
      this.customerID = customerID;
      Bill bill = new Bill();
      billstring = bill.getUrlInfo();
  }
  public String getPatientBill(){
      return pbill;
  }
   public void setCustomerInfo(){
    
     boolean idfound = false;
     String str[] = billstring.split("},", 2);
     List<String> billList = new ArrayList<String>();
     billList = Arrays.asList(str);
     for (int counter = 0; counter < billList.size(); counter++) { 
         String tempbill= billList.get(counter);
         boolean customerIDfound = tempbill.contains(customerID);
         if (customerIDfound == true){
          pbill = billList.get(counter);
          idfound = true;
         }
      }
      
     if(idfound = false){
      //throws exeption
        throw new IllegalArgumentException("Customer ID not found");
     }
   } 
           

            
}
 
