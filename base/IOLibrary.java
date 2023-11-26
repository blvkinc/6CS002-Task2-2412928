package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * Utility class for input/output operations.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public final class IOLibrary {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Reads a string from the standard input.
     * 
     * @return The string read from the input
     */
    public static String getString() {
        do {
            try {
                return reader.readLine();
            } catch (IOException e) {
                // Handle or log the exception
            }
        } while (true);
    }

    /**
     * Reads an IP address from the standard input and returns it.
     * 
     * @return The IP address read from the input
     */
    public static InetAddress getIPAddress() {
        do {
            try {
                String[] chunks = reader.readLine().split("\\.");
                byte[] data = {
                    Byte.parseByte(chunks[0]),
                    Byte.parseByte(chunks[1]),
                    Byte.parseByte(chunks[2]),
                    Byte.parseByte(chunks[3])
                };
                return Inet4Address.getByAddress(data);
            } catch (IOException | NumberFormatException e) {
                // Handle or log the exception
            }
        } while (true);
    }
}
