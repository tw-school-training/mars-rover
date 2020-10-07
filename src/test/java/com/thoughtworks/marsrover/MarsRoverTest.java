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

    @Test
    public void should_return_x_plus_1_when_action_given_command_is_M_and_facing_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");

        //when
        marsRover.executeCommands("M");

        //then
        Assertions.assertEquals(2, marsRover.getPositionX());
    }

    @Test
    public void should_return_x_minus_1_when_action_given_command_is_M_and_facing_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "S");

        //when
        marsRover.executeCommands("M");

        //then
        Assertions.assertEquals(0, marsRover.getPositionX());
    }
}
