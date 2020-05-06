import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.lang.NullPointerException;


public class Bill{
    //The default constructor, which is left empty on purpose.
    public Bill(){}
    //The method which, when called, returns a string that contains the information recieved
    //from the HPMS Bill web service API call.
    public String getUrlInfo(){
        //Creates the String variable named urlString with the .
        String urlString="http://happy-pets-web-1522142859.us-east-1.elb.amazonaws.com/billing";
        //An empty results string which stores the first read line from the HPMS Bill web service API call.
        String results=" ";
        //Tries to open a URL Connection with the urlString vairable, then uses a buffered reader to read
        //all of the information recieved.
               try{
                   //Creates the URL variable named url with urlString as its parameters.
                   URL url=new URL(urlString);
                   //Creates a URLConnection variable.
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
                       //cant fix this null pointer exception
                   }
                   rdr.close();
               }
               catch(IOException e){
                   System.err.println("API CALL FAILED");
                   System.exit(1);
                   }
        return results;
    }
}
