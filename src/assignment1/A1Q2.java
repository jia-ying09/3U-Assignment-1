/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


/**
 *
 * @author linj4653
 */
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import becker.robots.City;
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating kitchener city
        City kitchener = new City();
        //creating robot timmy
        Robot timmy = new Robot(kitchener, 1, 3, Direction.NORTH);
        //creating square wall
        new Wall (kitchener, 1, 3, Direction.NORTH);
        new Wall (kitchener, 1, 2, Direction.NORTH);
        new Wall (kitchener, 1, 2, Direction.WEST);
        new Wall (kitchener, 2, 2, Direction.WEST);
        new Wall (kitchener, 2, 2, Direction.SOUTH);
        new Wall (kitchener, 1, 3, Direction.EAST);
        new Wall (kitchener, 1, 3, Direction.SOUTH);
        //inserting newspaper
        new Thing (kitchener, 2, 3);
        //making timmy move around the square wall
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();    
        timmy.move();      
        timmy.turnLeft();
        timmy.move();
         //timmy picks up the newspaper
        timmy.pickThing();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        
        
    }
}
