package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int positionX;
    private int positionY;
    private final String direction;

    public MarsRover(int positionX, int positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        List<String> commandList = Arrays.asList(commands.split(""));
        commandList.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if (command.equalsIgnoreCase("M")) {
            if (direction.equalsIgnoreCase("N")) {
                positionY += 1;
            }

            if (direction.equalsIgnoreCase("S")) {
                positionY -= 1;
            }

            if (direction.equalsIgnoreCase("E")) {
                positionX += 1;
            }

            if (direction.equalsIgnoreCase("W")) {
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

    public String getDirection() {
        return direction;
    }
}
