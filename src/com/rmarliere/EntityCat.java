package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class EntityCat extends Entity {

    public final String move = "slinking";
    public final String type = "claw";

    public EntityCat(String identifier)
    {
        setID(identifier);
        setMove(move);
        setType(type);
    }
}
