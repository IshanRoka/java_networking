import java.net.*;

public class SameAddressCheck {
    public static void main(String[] args) {
        try {
            InetAddress ibiblio = InetAddress.getByName("www.ibiblio.com");
            InetAddress helios = InetAddress.getByName("ibiblio.com");
            
            if (ibiblio.equals(helios)) {
                System.out.println("www.wikipedia.org is the same as wikipedia.com");
                System.out.println("IP Address: " + ibiblio.getHostAddress());
            } else {
                System.out.println("www.wikipedia.org is not the same as wikipedia.com");
                System.out.println("IP Address of www.wikipedia.org: " + ibiblio.getHostAddress());
                System.out.println("IP Address of wikipedia.com: " + helios.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            System.out.println("Host lookup failed.");
        }
    }
}
