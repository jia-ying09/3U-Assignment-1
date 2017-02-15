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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // making Kitchener city
        City kitchener = new City();
        //creating timmy
        Robot timmy = new Robot(kitchener, 3, 3, Direction.EAST);
        //creating maria
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        //creating items
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        //creating supernmarket
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        //setting labels
        timmy.setLabel("timmy");
        maria.setLabel("maria");
        //MAKING THE ROBOTS MOVE
        timmy.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();               
        timmy.turnLeft();
        timmy.move();
        maria.move();
        timmy.turnLeft();
        timmy.turnLeft();
        timmy.turnLeft();
        maria.turnLeft();
        maria.pickThing();
        timmy.move();
        timmy.pickThing();
        timmy.move();
        maria.move();       
        timmy.pickThing();
        timmy.turnLeft(); maria.pickThing();
        
        
        
               
        
        
    }
    
}
