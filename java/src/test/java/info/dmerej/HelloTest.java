package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {


    @Test
    void testMoveForwardFacingNorth(){
        Rover rover = new Rover(0,0,"N");
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals("N", rover.getFacing());

        Rover rover2= new Rover(0,0,"W");
        rover.moveForward();
        assertEquals(1, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals("N", rover.getFacing());
        


    }
}
