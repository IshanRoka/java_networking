import java.net.*;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getByName("www.google.com");
            System.out.println("Address1: " + address1);
            printAddressDetails(address1);

            InetAddress address2 = InetAddress.getByName("93.184.216.34");
            System.out.println("Address2: " + address2);
            printAddressDetails(address2);

            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Address: " + localAddress);
            printAddressDetails(localAddress);

            InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");
            for (InetAddress addr : allAddresses) {
                System.out.println("Google Address: " + addr);
                printAddressDetails(addr);
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not find the address.");
        }
    }

    public static void printAddressDetails(InetAddress address) {
        System.out.println("Canonical Hostname: " + address.getCanonicalHostName());
        System.out.println("Host Address: " + address.getHostAddress());
        System.out.println("Host Name: " + address.getHostName());
        System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
        System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());
        System.out.println("Is Loopback Address: " + address.isLoopbackAddress());
        System.out.println("Is Multicast Address: " + address.isMulticastAddress());
        System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());
        System.out.println();
    }
}
