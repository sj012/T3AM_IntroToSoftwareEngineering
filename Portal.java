import java.util.List;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.lang.NullPointerException;


public class Portal{

public Portal(){
    //default constructor
}
    public String getUrlInfo(){
        String urlString="http://happy-pets-web-1522142859.us-east-1.elb.amazonaws.com/patient-portal";
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
