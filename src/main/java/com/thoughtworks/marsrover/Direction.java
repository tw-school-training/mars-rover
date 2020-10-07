package com.thoughtworks.marsrover;

public enum Direction {
    N, E, S, W;

    public Direction left() {
        int leftIndex = (this.ordinal() + 3) % 4;
        return Direction.values()[leftIndex];
    }

    public Direction right() {
        int rightIndex = (this.ordinal() + 1) % 4;
        return Direction.values()[rightIndex];
    }
}
