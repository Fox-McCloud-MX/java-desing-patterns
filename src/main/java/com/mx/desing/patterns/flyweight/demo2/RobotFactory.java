package com.mx.desing.patterns.flyweight.demo2;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    Map<String, IRobot> shapes = new HashMap<>();

    public int TotalObjectsCreated() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotType) throws Exception {
        IRobot robotCategory = null;
        if (shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);
        } 
        else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have King Robot. So we arecreating a King Robot now.");
                    robotCategory = new Robot("King");
                    shapes.put("King", robotCategory);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we arecreating a Queen Robot now.");
                    robotCategory = new Robot("Queen");
                    shapes.put("Queen", robotCategory);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only king andqueen type robots");
            }
        }
        return robotCategory;
    }
}
