package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class EntityTree extends Entity {

    public String move = "swaying";

    public EntityTree(String identifier)
    {
        setID(identifier);
        setMove(move);
    }
}
