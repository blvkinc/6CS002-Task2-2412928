package base;

/**
 * Represents a domino tile with two numbers.
 * 
 * This class encapsulates the behavior and properties of a domino tile.
 * It includes methods for placement, inversion, comparison, and string representation.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class Domino implements Comparable<Domino> {
    private int high;
    private int low;
    private int hx;
    private int hy;
    private int lx;
    private int ly;
    private boolean placed = false;

    /**
     * Constructor for creating a domino with given high and low values.
     * 
     * @param high The higher value of the domino
     * @param low  The lower value of the domino
     */
    public Domino(int high, int low) {
        this.high = high;
        this.low = low;
    }

    /**
     * Places the domino on the board at specified coordinates.
     * 
     * @param higherX x-coordinate for the higher value
     * @param higherY y-coordinate for the higher value
     * @param lowerX  x-coordinate for the lower value
     * @param lowerY  y-coordinate for the lower value
     */
    public void place(int higherX, int higherY, int lowerX, int lowerY) {
        this.hx = higherX;
        this.hy = higherY;
        this.lx = lowerX;
        this.ly = lowerY;
        placed = true;
    }

    /**
     * Returns a string representation of the domino.
     * 
     * @return String representation of the domino
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(high);
        result.append(low);
        result.append("]");

        if (!placed) {
            result.append(" unplaced");
        } else {
            result.append("(");
            result.append(hx + 1);
            result.append(",");
            result.append(hy + 1);
            result.append(")");
            result.append("(");
            result.append(lx + 1);
            result.append(",");
            result.append(ly + 1);
            result.append(")");
        }
        return result.toString();
    }

    /**
     * Inverts the domino by rotating it 180 degrees clockwise.
     */
    public void invert() {
        int tempX = hx;
        hx = lx;
        lx = tempX;

        int tempY = hy;
        hy = ly;
        ly = tempY;
    }

    /**
     * Checks if the domino is placed horizontally.
     * 
     * @return True if the domino is placed horizontally, otherwise false
     */
    public boolean isHorizontal() {
        return hy == ly;
    }

    // Getter and Setter methods for private fields

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHx() {
        return hx;
    }

    public void setHx(int hx) {
        this.hx = hx;
    }

    public int getHy() {
        return hy;
    }

    public void setHy(int hy) {
        this.hy = hy;
    }

    public int getLx() {
        return lx;
    }

    public void setLx(int lx) {
        this.lx = lx;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    /**
     * Compares this domino to another based on their high and low values.
     * 
     * @param other The other domino to compare with
     * @return 1 if this domino's high value is less than the other, 
     *         otherwise the comparison of their low values
     */
    public int compareTo(Domino other) {
        if (this.high < other.high) {
            return 1;
        }
        return this.low - other.low;
    }
}
