package com.thoughtworks.marsrover;

public class CommandFactory {
    public Command build(String command) {

        if (command.equalsIgnoreCase("M")) {
            return new MoveCommand();
        }
        if (command.equalsIgnoreCase("L")) {
            return new LeftCommand();
        }
        if (command.equals("R")) {
            return new RightCommand();
        }

        throw new NoCommandFoundException();
    }
}
