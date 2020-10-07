package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int positionX;
    private int positionY;
    private Direction heading;

    public MarsRover(int positionX, int positionY, Direction heading) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.heading = heading;
    }

    public void executeCommands(String commands) {
        List<String> commandList = Arrays.asList(commands.split(""));
        commandList.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        Direction NORTH = Direction.N;
        Direction WEST = Direction.W;
        Direction EAST = Direction.E;
        Direction SOUTH = Direction.S;
        if (command.equalsIgnoreCase("M")) {
            if (heading.equals(NORTH)) {
                positionY += 1;
            }

            if (heading.equals(SOUTH)) {
                positionY -= 1;
            }

            if (heading.equals(EAST)) {
                positionX += 1;
            }

            if (heading.equals(WEST)) {
                positionX -= 1;
            }
        } else if (command.equalsIgnoreCase("L")) {
            heading = heading.left();
        } else if (command.equals("R")) {
            heading = heading.right();
        }
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction getHeading() {
        return heading;
    }
}
