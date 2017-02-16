/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.City;
import becker.robots.Wall;

/**
 *
 * @author linj4653
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating city kitchener
        City kitchener = new City();
        // creating robot timmy
        Robot timmy = new Robot(kitchener, 1, 3, Direction.WEST);
        //making square wall
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.WEST);
        //making timmy move
        timmy.move();
        timmy.turnLeft();      
        timmy.move();
        timmy.move();
        timmy.move();
        timmy.turnLeft();       
        timmy.move();
        timmy.move();
        timmy.move();
        timmy.turnLeft();       
        timmy.move();
        timmy.move();
        timmy.move();
        timmy.turnLeft();
        timmy.move();
        timmy.move();
        
    }
}
