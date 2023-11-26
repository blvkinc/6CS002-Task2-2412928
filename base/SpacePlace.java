package base;

/**
 * Represents a location in space.
 * 
 * Manages the coordinates and angles of a point in space.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class SpacePlace {
    private int xCoordinate;
    private int yCoordinate;
    private double theta;
    private double phi;

    public SpacePlace() {
        xCoordinate = 0;
        yCoordinate = 0;
    }

    public SpacePlace(double theta, double phi) {
        this();
        this.theta = theta;
        this.phi = phi;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }
}
