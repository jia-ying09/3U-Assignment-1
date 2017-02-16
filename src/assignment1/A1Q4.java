/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author jiaying
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city kitchener
        City kitchener = new City();

        //robot timmy
        Robot timmy = new Robot(kitchener, 0, 0, Direction.SOUTH);
        //robot timmy2
        Robot timmy2 = new Robot(kitchener, 0, 1, Direction.SOUTH);
        //instering wall
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        //making robots meet
        timmy.move();
        timmy2.move();
        timmy.move();
        timmy2.turnLeft();
        timmy2.move();
        timmy.turnLeft();
        timmy2.turnLeft();
        timmy2.turnLeft();
        timmy2.turnLeft();
        timmy2.move();
        timmy2.turnLeft();
        timmy2.turnLeft();
        timmy2.turnLeft();
        timmy2.move();
        timmy.move();
    }

}
