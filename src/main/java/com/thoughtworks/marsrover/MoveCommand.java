package com.thoughtworks.marsrover;

public class MoveCommand implements Command {
    @Override
    public RoverStatus operate(RoverStatus roverStatus) {
        Direction direction = roverStatus.getDirection();
        int positionX = roverStatus.getPositionX();
        int positionY = roverStatus.getPositionY();

        if (direction.equals(Direction.N)) {
            positionY += 1;
        }

        if (direction.equals(Direction.S)) {
            positionY -= 1;
        }

        if (direction.equals(Direction.E)) {
            positionX += 1;
        }

        if (direction.equals(Direction.W)) {
            positionX -= 1;
        }

        return new RoverStatus(positionX, positionY, direction);
    }
}
