package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class EntityGhost extends Entity {

    public final String move = "floating";
    public final String type = "supernatural";

    public EntityGhost(String identifier)
    {
        setID(identifier);
        setMove(move);
        setType(type);
    }
}
