import java.net.InetAddress;

public class InetAddressReachable {
    public static void main(String[] args) {
        try {
            InetAddress net = InetAddress.getByName("192.168.1.165");
            if (net.isReachable(1000)) { 
                System.out.println("Success");
            } else {
                System.out.println("Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
