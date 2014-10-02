package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class EntityDog extends Entity {

    public String move = "walking";
    public String type = "biting";

    public EntityDog(String identifier)
    {
        setID(identifier);
        setMove(move);
        setType(type);
    }


}
