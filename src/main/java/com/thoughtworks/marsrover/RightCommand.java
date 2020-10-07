package com.thoughtworks.marsrover;

public class RightCommand implements Command {
    @Override
    public RoverStatus operate(RoverStatus roverStatus) {
        return new RoverStatus(roverStatus.getPositionX(), roverStatus.getPositionY(), roverStatus.getDirection().right());
    }
}
