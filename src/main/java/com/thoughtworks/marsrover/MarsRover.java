package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int positionX;
    private int positionY;
    private final String heading;

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
        if (command.equalsIgnoreCase("M")) {
            if (heading.equalsIgnoreCase("N")) {
                positionY += 1;
            }

            if (heading.equalsIgnoreCase("S")) {
                positionY -= 1;
            }

            if (heading.equalsIgnoreCase("E")) {
                positionX += 1;
            }

            if (heading.equalsIgnoreCase("W")) {
                positionX -= 1;
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
