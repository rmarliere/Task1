package com.rmarliere;

/**
 * Author: Rodrigo Marliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class Main {

    public static void main(String[] args) {

        Entity dog      = new EntityDawg("dog");
        Entity ghost    = new EntityGhost("ghost");
        Entity tree     = new EntityTree("tree");
        Entity cat      = new EntityCat("cat");
        Entity alien    = new EntityAlien("alien");

        dog.initiateAttack(ghost);
        dog.initiateAttack(tree);
        dog.initiateAttack(dog);
        dog.initiateAttack(cat);
        dog.initiateAttack(alien);

        ghost.initiateAttack(ghost);
        ghost.initiateAttack(tree);
        ghost.initiateAttack(dog);
        ghost.initiateAttack(cat);
        ghost.initiateAttack(alien);

        tree.initiateAttack(ghost);
        tree.initiateAttack(tree);
        tree.initiateAttack(dog);
        tree.initiateAttack(cat);
        tree.initiateAttack(alien);

        cat.initiateAttack(ghost);
        cat.initiateAttack(tree);
        cat.initiateAttack(dog);
        cat.initiateAttack(cat);
        cat.initiateAttack(alien);

        alien.initiateAttack(ghost);
        alien.initiateAttack(tree);
        alien.initiateAttack(dog);
        alien.initiateAttack(cat);
        alien.initiateAttack(alien);

    }
}
