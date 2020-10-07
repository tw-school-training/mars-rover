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
        if (command.equalsIgnoreCase("M")) {
            if (heading.equalsIgnoreCase(NORTH)) {
                positionY += 1;
            }

            if (heading.equalsIgnoreCase("S")) {
                positionY -= 1;
            }

            if (heading.equalsIgnoreCase("E")) {
                positionX += 1;
            }

            if (heading.equalsIgnoreCase(WEST)) {
                positionX -= 1;
            }
        } else if (command.equalsIgnoreCase("L")) {
            if (heading.equalsIgnoreCase(NORTH)) {
                heading = WEST;
            }
        } else if (command.equalsIgnoreCase("R")) {
            if (heading.equalsIgnoreCase(NORTH)) {
                heading = "E";
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
