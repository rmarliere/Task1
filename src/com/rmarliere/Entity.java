package com.rmarliere;

/**
 * Author: RodrigoMarliere
 * Revision date: 10/2/14
 * Assignment: Task 1
 * Class: CS 349
 */

public class Entity {

    private String id;
    private String move;
    private String type;

    public void initiateAttack(Entity attacked_object)
    {
        if (!isAttackValid(attacked_object,this))
        {
            System.out.println(this.getID() + " can't attack a " + attacked_object.getID());
        }
        else
        {
            move();
            System.out.println(getID() + " initiated " + getType() +  " attack against " + attacked_object.getID());
            attacked_object.receiveAttack(this);
        }
    }

    private void move()
    {
        System.out.println(getID() + " moves by " + getMove());
    }

    private void receiveAttack(Entity attacking_object)
    {
        System.out.println(getID() + " received attack by " + attacking_object.getID());
    }

    private boolean isAttackValid(Entity attacked, Entity attacking)
    {
        //dog
        if (attacking instanceof EntityDawg && (attacked instanceof EntityGhost || attacked instanceof EntityAlien))
        {
            return false;
        }
        //tree
        if (attacking instanceof EntityTree)
        {
            return false;
        }
        //ghost
        if (attacking instanceof EntityGhost && (attacked instanceof EntityGhost || attacked instanceof EntityAlien))
        {
            return false;
        }
        //cat
        if (attacking instanceof EntityCat && (attacked instanceof EntityGhost || attacked instanceof EntityAlien))
        {
            return false;
        }

        return true;
    }

    /*
    Getters and setters
     */

    public String getID()
    {
        return this.id;
    }

    public void setID(String id)
    {
        this.id = id;
    }

    public void setMove(String move)
    {
        this.move = move;
    }

    public String getMove()
    {
        return this.move;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}
