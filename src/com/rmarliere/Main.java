package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class Main {

    public static void main(String[] args) {

        Entity dog      = new EntityDog("dog");
        Entity ghost    = new EntityGhost("ghost");
        Entity tree     = new EntityTree("tree");

        dog.initiateAttack(ghost);
        dog.initiateAttack(tree);
        dog.initiateAttack(dog);

        ghost.initiateAttack(ghost);
        ghost.initiateAttack(tree);
        ghost.initiateAttack(dog);

        tree.initiateAttack(ghost);
        tree.initiateAttack(tree);
        tree.initiateAttack(dog);

    }
}
