/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author jiaying
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city
        City kitchener = new City();
        //creating robot timmy
        Robot timmy = new Robot(kitchener, 3, 0, Direction.EAST);
        //creating the flag
        new Thing(kitchener, 3, 1);
        //creating the mountain
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        //timmy picks up the flag
        timmy.move();
        timmy.pickThing();
        //TIMMY MOVES UP THE MOUNTAIAN
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.move();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        //timmy plants the flag
        timmy.putThing();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        timmy.move();
        timmy.turnLeft();
        
        
    }
    
}
