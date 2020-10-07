package com.thoughtworks.marsrover;

public interface Command {
    abstract RoverStatus operate(RoverStatus roverStatus);
}
