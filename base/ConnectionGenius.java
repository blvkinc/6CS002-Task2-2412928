package base;

import java.net.InetAddress;

/**
 * The ConnectionGenius class represents a game connection manager. It handles
 * downloading the web version, connecting to the web service, and initiating
 * gameplay.
 * 
 * Author: Kevan Buckley, maintained by __student Version: 2.0, 2014
 */

public class ConnectionGenius {

	// The IP address for the game connection
	private InetAddress ipAddress;

	/**
	 * Constructs a ConnectionGenius object with the specified IP address.
	 * 
	 * @param ipAddress The InetAddress representing the IP address for the game
	 *            connection.
	 */
	public ConnectionGenius(InetAddress ipa) {
		this.setIpa(ipAddress);
	}

	/**
	 * Initiates the game by downloading the web version, connecting to the web
	 * service, and starting gameplay.
	 */
	public void fireUpGame() {
		downloadWebVersion();
		connectToWebService();
		awayWeGo();
	}

	/**
	 * Downloads the specialized web version for the game.
	 */
	public void downloadWebVersion() {
		printMessage("Getting specialised web version.");
		printMessage("Wait a couple of moments");
	}

	/**
	 * Connects to the web service required for the game.
	 */
	public void connectToWebService() {
		printMessage("Connecting");
	}

	/**
	 * Indicates that the game is ready to play.
	 */
	public void awayWeGo() {
		printMessage("Ready to play");
	}

	/**
	 * Prints a message to the console.
	 * 
	 * @param message The message to be printed.
	 */
	private void printMessage(String message) {
		System.out.println(message);
	}

	/**
	 * Gets the IP address associated with the game connection.
	 * 
	 * @return The InetAddress representing the IP address.
	 */
	InetAddress getIpa() {
		return ipAddress;
	}

	/**
	 * Sets the IP address for the game connection.
	 * 
	 * @param ipAddress The InetAddress representing the IP address to be set.
	 */
	void setIpa(InetAddress ipAddress) {
		this.ipAddress = ipAddress;
	}

}