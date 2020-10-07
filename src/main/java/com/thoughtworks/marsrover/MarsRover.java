package com.thoughtworks.marsrover;

public class MarsRover {
    private int positionX;
    private final int positionY;
    private final String direction;

    public MarsRover(int positionX, int positionY, String direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {

    }


    public int getPositionX() {
        return positionX;
    }
}
