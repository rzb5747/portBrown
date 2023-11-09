import java.net.Socket;
import java.io.IOException;

public class PortScanner {
    public static void main(String[] args) {
        String targetHost = "10.0.0.72"; // Change this to the target host you want to scan
        int minPort = 1;
        int maxPort = 65535;

        System.out.println("Scanning ports on " + targetHost + "...");

        for (int port = minPort; port <= maxPort; port++) {
            try {
                Socket socket = new Socket(targetHost, port);
                System.out.println("Port " + port + " is open");
                socket.close();
            } catch (IOException e) {
                // Port is likely closed or unreachable
            }
        }

        System.out.println("Port scanning finished.");
    }
}