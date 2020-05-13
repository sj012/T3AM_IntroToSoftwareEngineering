import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.lang.NullPointerException;

/**
* Upon being called, Bill.java runs getUrlInfo, which is an API Call to the HPMS
* Bill web service. It stores this value in the private String, bill, which can be
* retrieved from the getBill method.
* <p>
* This class runs the getUrlInfo method in the default constructor and sets it 
* as the private String bill. The method getBill returns this string.
*
* @param  String urlString: The url for the HPMS Bill webservice API call.
* @param  String results: the String that contains the result of the HPMS Bill, 
* which is then pass to the private String bill.
* @param  private String bill: The string that will keep the results of the String
* results stored within the class.
* web service API Call.
* @return private String bill is returned when getBill is called.
*/

public class Bill{
    private String bill;
    public Bill(){
        bill = getUrlInfo();
    }
    public String getBill(){
        return this.bill;
    }
    public String getUrlInfo(){
        
        String urlString="http://happy-pets-web-1522142859.us-east-1.elb.amazonaws.com/billing";
        
        String results=" ";
       
               try{
                   URL url=new URL(urlString);
                   
                   URLConnection connect=url.openConnection();
                   
                   BufferedReader rdr=new BufferedReader(new InputStreamReader(connect.getInputStream()));
                   
                   results=rdr.readLine();
                   
                   String nextLn=" ";
                   
                   try {
                      
                       while(nextLn.isEmpty()==false){
                            
                           results=results+nextLn;
                           
                           nextLn=rdr.readLine();
                       }
                   }
                   
                   catch(NullPointerException e) {
                       //Left empty on purpose.
                   }
                   
                   rdr.close();
               }
              
               catch(IOException e){
                   
                   return "F1";
                   }
       
        return results;
    }
}
