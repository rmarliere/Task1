package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class EntityDawg extends Entity {

    public final String move = "walking";
    public final String type = "biting";

    public EntityDawg(String identifier)
    {
        setID(identifier);
        setMove(move);
        setType(type);
    }
}
