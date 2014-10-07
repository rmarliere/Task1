package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class EntityAlien extends Entity {

    public final String move = "teleporting";
    public final String type = "raygun";

    public EntityAlien(String identifier)
    {
        setID(identifier);
        setMove(move);
        setType(type);
    }
}
