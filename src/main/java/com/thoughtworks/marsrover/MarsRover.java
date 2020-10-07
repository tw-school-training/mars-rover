package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int positionX;
    private int positionY;
    private String heading;

    public MarsRover(int positionX, int positionY, String heading) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.heading = heading;
    }

    public void executeCommands(String commands) {
        List<String> commandList = Arrays.asList(commands.split(""));
        commandList.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        String NORTH = "N";
        String WEST = "W";
        String EAST = "E";
        String SOUTH = "S";
        if (command.equalsIgnoreCase("M")) {
            if (heading.equalsIgnoreCase(NORTH)) {
                positionY += 1;
            }

            if (heading.equalsIgnoreCase(SOUTH)) {
                positionY -= 1;
            }

            if (heading.equalsIgnoreCase(EAST)) {
                positionX += 1;
            }

            if (heading.equalsIgnoreCase(WEST)) {
                positionX -= 1;
            }
        } else if (command.equalsIgnoreCase("L")) {
            if (heading.equalsIgnoreCase(NORTH)) {
                heading = WEST;
            } else if (heading.equalsIgnoreCase(EAST)) {
                heading = NORTH;
            } else if (heading.equalsIgnoreCase(SOUTH)) {
                heading = EAST;
            } else if (heading.equalsIgnoreCase(WEST)) {
                heading = SOUTH;
            }
        } else if (command.equalsIgnoreCase("R")) {
            if (heading.equalsIgnoreCase(NORTH)) {
                heading = EAST;
            } else if (heading.equalsIgnoreCase(EAST)) {
                heading = SOUTH;
            } else if (heading.equalsIgnoreCase(SOUTH)) {
                heading = WEST;
            } else if (heading.equalsIgnoreCase(WEST)) {
                heading = NORTH;
            }
        }
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getHeading() {
        return heading;
    }
}
