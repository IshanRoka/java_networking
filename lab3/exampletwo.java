import java.io.*;
import java.net.*;

public class exampletwo {
    public static void main(String[] args) {
        BufferedReader in_data = null;
        try {
            URL u = new URL("https://www.google.com/");
            URLConnection uc = u.openConnection();
            in_data = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            
            String entry;
            while ((entry = in_data.readLine()) != null) {
                System.out.println(entry);
            }
        } catch (MalformedURLException ex) {
            System.err.println("It is not a parseable URL");
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            if (in_data != null) {
                try {
                    in_data.close();
                } catch (IOException ex) {
                    System.err.println("Error closing the BufferedReader: " + ex);
                }
            }
        }
    }
}
