package edu.osucascades.guevarra;

import java.util.*;

public class Vampire extends Monster {

    //create a field to store the Vampires blood reserves.  Access mode? static? type?
    public int bloodReserves;
    public String name;
    public int health;

    //constructor(s)
    public Vampire() {
        this.health = 0;
        name = setName("Default Vampire");  //this calls your parameterized constructor passing it the string "Default Vampire"
        this.bloodReserves = 0;

    }

    public Vampire(String name) {
        //call super classes constructor
        super();


        //Sets Vampire's name

        this.setName(name);


        //initialize blood reserves
        this.bloodReserves = 0;
//        timer();  //check this function out. it draws down the object's blood reserves over time.
    }
    //define a new makeNoise method.  Make it say "I want to drink your blood" plus the vampire's name
    //override sayName method

    public static void main(String[] args) {

        //create a new vampire
        Vampire vampire = new Vampire("Dracula");
        //make it introduce itself and make a noise
        vampire.sayName();
        vampire.makeNoise();
        //create a new Zombie - whichever one you want

        //make it introduce itself and make a noise
        //set the Zombies health to 10 and make sure it's set to 10
        Zombie zombie = new Zombie("Cersi Lannister ");
        zombie.setName("Cersi Lannister ");
        zombie.sayName();
        zombie.makeNoise();

        zombie.setHealth(15);

        //let the vampire attack the Zombie
        //print the Zombie's health and display if its dead
        vampire.attack(zombie, 5);
        vampire.attack(zombie, 10);
        vampire.attack(zombie, 15);


        vampire.timer();


    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public void sayName() {
        System.out.println("You can call me " + name + " if you are nice");

    }

    public void makeNoise() {

        System.out.println("I'm going to drink your blood");

    }

    //Leave this one as is. It reduces the vampires blood reserves by 3 every 10 seconds */
    private void timer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                //Your logic it will repeating your task ever 10 seconds....
                loseBlood(3);

            }
        }, 5000, 5000);
    }

    // override attack. A vampire's attack works a little differently.
    // They kill their opponent immediately and drink some of their blood
    @Override
    public void attack(Monster m, int attackPoints) {

        // lower its health
        health = m.health - attackPoints;
        //  print it's health
        System.out.println(m.name + " is being attacked!");
        System.out.println(m.name + "'s health is " + health);

        if (health <= 0) {
            System.out.println(m.name + "is dead");

        }


    }

    //override function isDead. The vampire dies when its bloodReserves run out.  Poor Edward!
//    public boolean isDead() {
//        //Implement this function
//    }

    //define a new looseBlood method. Every time it's called, you reduce the Vampires blood reserves by the bloodAmount
    public void loseBlood(int bloodAmount) {
        //implement this method
    }


}