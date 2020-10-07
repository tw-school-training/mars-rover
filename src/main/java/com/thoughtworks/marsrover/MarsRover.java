package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(int positionX, int positionY, Direction heading) {
        this.roverStatus = new RoverStatus(positionX, positionY, heading);
    }

    public void executeCommands(String commands) {
        List<String> commandList = Arrays.asList(commands.split(""));
        commandList.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if (!command.isEmpty()) {
            roverStatus = new CommandFactory().build(command).operate(roverStatus);
        }
    }

    //Todo getRoverStatus

    public int getPositionX() {
        return roverStatus.getPositionX();
    }

    public int getPositionY() {
        return roverStatus.getPositionY();
    }

    public Direction getHeading() {
        return roverStatus.getDirection();
    }
}
