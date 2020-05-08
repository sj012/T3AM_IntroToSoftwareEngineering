import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.lang.NullPointerException;

//This is the Bill.java class, which purpose is to run the getUrlInfo method, which should return a string that contains the results
//of the HPMS Bill web service API call.
public class Bill{
    //The default constructor, which is left empty on purpose.
    public Bill(){}
    //The method which, when called, returns a string that contains the information recieved
    //from the HPMS Bill web service API call.
    public String getUrlInfo(){
        //Creates the String named urlString with the HPMS Bill web service as its parameters.
        String urlString="http://happy-pets-web-1522142859.us-east-1.elb.amazonaws.com/billing";
        //Creates the empty String named results, which will be returned at the end of the method.
        String results=" ";
        //Tries to open a URL Connection with urlString , then uses a buffered reader to read
        //all of the information recieved. Inside of the try statement there exists another try statement that
        //reads all of the information. Catches if an error occurs with the API call, which results in the message
        //"ERROR: API CALL TO HPMS BILLING FAILED" and an exit code of 1.
               try{
                   //Creates the URL variable named url with the String urlString as its parameters.
                   URL url=new URL(urlString);
                   //Creates a URLConnection named connect that runs the openConnection method with the URL
                   //url.
                   URLConnection connect=url.openConnection();
                   //Creates a URLConnection named rdr that has an InputStreamReader variable as its paramaters,
                   //which has the results of the getInputStream method from the URLConnection connect.
                   BufferedReader rdr=new BufferedReader(new InputStreamReader(connect.getInputStream()));
                   //Sets results to the rdr.readLine() output.
                   //For this program, it should be the result of the api call from the HPMS Bill web service as its parameters.
                   results=rdr.readLine();
                   //Creates the empty String called nextLn.
                   String nextLn=" ";
                   //Tries to run while nextLn is not empty, then adds the value of String nxtLn to results.
                   try {
                       //While the String nextLn is not empty, it adds the value of nextLn to the String results. 
                       while(nextLn.isEmpty()==false){
                           //Sets the String results to results + the String nextLn. 
                           results=results+nextLn;
                           //Sets nextLn to read the next line in the BufferedReader rdr.
                           nextLn=rdr.readLine();
                       }
                   }
                   //Catches null pointer exception, which will always be ran at once the buffered reader runs out of information
                   //to read.
                   catch(NullPointerException e) {
                       //Left empty on purpose.
                   }
                   //Closes the BufferedReader rdr.
                   rdr.close();
               }
               //Catch statement that runs if there is a failure with the API Call.
               catch(IOException e){
                   //Returns a specific string that will be picked up by the Test Runner as a failed run.
                   return "F1";
                   }
        //Returns the String results.
        //For this program, it should be the result of the api call from the HPMS Bill web service as its parameters. 
        return results;
    }
}
