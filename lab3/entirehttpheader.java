import java.net.*;
import java.io.*;

public class entirehttpheader {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.google.com/");
            URLConnection uc = u.openConnection();
            int i = 0;
            while (uc.getHeaderField(i) != null) {
                System.out.println(uc.getHeaderFieldKey(i) + ": " + uc.getHeaderField(i));
                i++;
            }
        } catch (MalformedURLException ex) {
            System.err.println("It is not a valid URL.");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
