package com.thoughtworks.marsrover;

public class LeftCommand implements Command {
    @Override
    public RoverStatus operate(RoverStatus roverStatus) {
        return new RoverStatus(roverStatus.getPositionX(), roverStatus.getPositionY(), roverStatus.getDirection().left());
    }
}
