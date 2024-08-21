import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LowPortScanner {
    public static void main(String[] args) {
        for (int i = 1; i < 1024; i++) {
            try {
                Socket socket = new Socket("localhost", i);
                System.out.println("There is a server on port " + i + " of localhost.");
                socket.close();
            } catch (UnknownHostException e) {
                System.out.println("Unknown host: " + e);
            } catch (IOException e) {
                 System.err.println("There is no server on port " + i + " of localhost.");
            }
        }
    }
}
