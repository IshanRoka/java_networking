import java.net.*;
import java.util.Enumeration;

public class NetworkInterfaceInfo {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                
                System.out.println("Name: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());
                System.out.println("MTU: " + networkInterface.getMTU());
                System.out.println("Loopback: " + networkInterface.isLoopback());
                System.out.println("Up: " + networkInterface.isUp());
                System.out.println("Virtual: " + networkInterface.isVirtual());
                System.out.println();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
