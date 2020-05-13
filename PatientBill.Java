import java.util.List;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;



public class PatientBill{
 
    //This is the ID that is going to used find the customer information
    private String customerID; 
    //This is where the customer's information is going to be held
    private String pbill;
    //This is the string that is being recieved by Bill.java
    private String billstring;
   
   //This revised the customer ID and all of the customers' information
  public PatientBill(String customerID){
      this.customerID = customerID;
      Bill bill = new Bill();
      billstring = bill.getUrlInfo();
  }
  //This returns the customer's information 
  public String getPatientBill(){
      return pBill;
  }
  //This grabs the seperates all of the customer IDs
   public void setCustomerInfo(){
     boolean idfound = false;
     String str[] = billstring.split("},");
     List<String> billList = new ArrayList<String>();
     billList = Arrays.asList(str);
    //Find the right string for the customers
     for (int counter = 0; counter < billList.size(); counter++) { 
         String tempbill= billList.get(counter);
         boolean customerIDfound = tempbill.contains(customerID);
         //says whether the ID is found
         if (customerIDfound == true){
          pBill = billList.get(counter);
          idfound = true;
          
         }
      }
      //Finds whether or not the ID was found
     if(idfound = false){
      //throws exeption
        throw new IllegalArgumentException("Customer ID not found");
     }
   } 
           

            
}
