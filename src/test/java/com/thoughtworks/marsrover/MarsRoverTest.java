package com.thoughtworks.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MarsRoverTest {
    @Test
    public void should_return_init_place_when_execute_given_command_is_empty() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");

        //when
        marsRover.executeCommands("");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("N", marsRover.getHeading());
    }

    @Test
    public void should_return_x_plus_1_when_execute_given_command_is_M_and_heading_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");

        //when
        marsRover.executeCommands("M");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(2, marsRover.getPositionY());
        Assertions.assertEquals("N", marsRover.getHeading());
    }

    @Test
    public void should_return_x_minus_1_when_execute_given_command_is_M_and_heading_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "S");

        //when
        marsRover.executeCommands("M");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(0, marsRover.getPositionY());
        Assertions.assertEquals("S", marsRover.getHeading());
    }

    @Test
    public void should_return_y_plus_1_when_execute_given_command_is_M_and_heading_is_E() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "E");

        //when
        marsRover.executeCommands("M");

        //then
        Assertions.assertEquals(2, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("E", marsRover.getHeading());
    }

    @Test
    public void should_return_y_minus_1_when_execute_given_command_is_M_and_heading_is_W() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "W");

        //when
        marsRover.executeCommands("M");

        //then
        Assertions.assertEquals(0, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("W", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_W_when_execute_given_command_is_L_and_heading_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");

        //when
        marsRover.executeCommands("L");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("W", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_E_when_execute_given_command_is_R_and_heading_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "N");

        //when
        marsRover.executeCommands("R");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("E", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_N_when_execute_given_command_is_L_and_heading_is_E() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "E");

        //when
        marsRover.executeCommands("L");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("N", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_S_when_execute_given_command_is_R_and_heading_is_E() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "E");

        //when
        marsRover.executeCommands("R");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("S", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_E_when_execute_given_command_is_L_and_heading_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "S");

        //when
        marsRover.executeCommands("L");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("E", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_W_when_execute_given_command_is_R_and_heading_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "S");

        //when
        marsRover.executeCommands("R");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("W", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_S_when_execute_given_command_is_L_and_heading_is_W() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "W");

        //when
        marsRover.executeCommands("L");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("S", marsRover.getHeading());
    }

    @Test
    public void should_return_heading_N_when_execute_given_command_is_R_and_heading_is_W() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, "W");

        //when
        marsRover.executeCommands("R");

        //then
        Assertions.assertEquals(1, marsRover.getPositionX());
        Assertions.assertEquals(1, marsRover.getPositionY());
        Assertions.assertEquals("N", marsRover.getHeading());
    }
}
