import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // replace with valid IP address if needed
        int port = 4567; // make sure the port matches the server's port

        try (
            Socket clientSocket = new Socket(serverAddress, port); // client needs server's IP/address and port to connect
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // read input data
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true); // write/send output data
            Scanner scanner = new Scanner(System.in) // take input from console
        ) {
            System.out.println("Connected to server...");
            while (true) { // loop continues until user enters 'quit' in console
                System.out.println("Enter text: ");
                String inputLine = scanner.nextLine(); // take input from console
                if (inputLine.equalsIgnoreCase("quit")) { // to end chat/connection
                    break;
                }
                pw.println(inputLine); // send typed message in console to server
                String response = br.readLine(); // server echoes the message sent by client, so getting response
                System.out.println("Server: " + response); // printing server's response
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
