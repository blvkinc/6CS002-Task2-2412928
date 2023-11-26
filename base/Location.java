package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Represents a location on a grid.
 * 
 * This class defines properties and methods for a location on a grid.
 * It includes methods for drawing grid lines and obtaining integer input.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class Location extends SpacePlace {
    private int column;
    private int row;
    private Direction direction;

    public enum Direction {
        VERTICAL, HORIZONTAL
    };

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Location(int row, int column, Direction direction) {
        this(row, column);
        this.direction = direction;
    }

    public String toString() {
        if (direction == null) {
            int tempCol = column + 1;
            return "(" + tempCol + "," + (row + 1) + ")";
        } else {
            int tempCol = column + 1;
            return "(" + tempCol + "," + (row + 1) + "," + direction + ")";
        }
    }

    public void drawGridLines(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        for (int tmp = 0; tmp <= 7; tmp++) {
            g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
        }
        for (int see = 0; see <= 8; see++) {
            g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
        }
    }

    public static int getInt() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException | NumberFormatException e) {
                // Handle or log the exception
                System.out.println("Please enter a valid integer.");
            }
        } while (true);
    }

    // Getters and setters for private fields

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
