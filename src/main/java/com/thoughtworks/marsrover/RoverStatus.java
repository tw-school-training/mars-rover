package com.thoughtworks.marsrover;

public class RoverStatus {
    private final int positionX;
    private final int positionY;
    private final Direction direction;

    public RoverStatus(int positionX, int positionY, Direction direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
