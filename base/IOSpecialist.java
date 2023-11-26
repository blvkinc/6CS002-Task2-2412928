package base;

/**
 * Represents a specialist for input/output operations.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class IOSpecialist {
    public IOSpecialist() {
    }

    /**
     * Gets a string using the IOLibrary utility.
     * 
     * @return The string obtained from the IOLibrary
     */
    public String getString() {
        return IOLibrary.getString();
    }
}
