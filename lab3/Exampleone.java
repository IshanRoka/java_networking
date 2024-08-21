
import java.io.*;
import java.net.*;
import java.util.Date;

public class Exampleone {

    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.google.com");
            URLConnection uc = u.openConnection();
            long date = uc.getDate();
            if (date == 0) {
                System.out.println("No date information.");
            } else {
                System.out.println("Date: " + new Date(date));
            }
        }
        catch (MalformedURLException ex) {
            System.err.println("It is not a parseable URL");
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
