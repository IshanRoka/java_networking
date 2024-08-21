import java.net.*;

public class Inetipv4ipv6Address {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.google.com"); 
            if (addr instanceof Inet6Address) {
                System.out.println("IPv6 = " + addr.getHostAddress());
            }
            if (addr instanceof Inet4Address) {
                System.out.println("IPv4 = " + addr.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
