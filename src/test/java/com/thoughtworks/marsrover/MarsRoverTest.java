package com.thoughtworks.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MarsRoverTest {
    @Test
    public void should_return_init_place_when_action_given_command_is_empty() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");

        //when
        marsRover.executeCommands("");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
    }
}
