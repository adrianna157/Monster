package edu.osucascades.guevarra;

public class Monster {
    //    private static int numOfMonsters;
    //add fields using the most restrictive type possible
//For all fields think about the following:
//(What is the access modifier? Public, Private,Protected? Is it static?)
    static public String name;
    static public int health;
    static public boolean dead;
    static private int numOfMonsters;

    //add constructor(s)
    // add method  It returns the name of the Monster. What is its access modifier? Is it static?
    static public String getName() {
        return name;

    }

    //add method  It has a String parameter used to set the Monster's name. What is its access modifier? Is it static?
    static public void setName(String name) {

    }

    //add method It returns the health of the Monster. What is its access modifier? Is it static?
    static public int getHealth() {

        return health;
    }

    //add method It has a integer parameter used to set the Monster's health. What is its access modifier? Is it static?
    static public void setHealth(int health) {

    }

    //add method  It returns the total # of monsters created. What is its access modifier? Is it static?
    static public int getNumOfMonsters() {
        return numOfMonsters;
    }

    //function isDead has no parameters. It returns true of the monster is dead and false if its alive.
    static public boolean isDead() {
        if (dead) {
            return true;
        } else {
            return false;
        }

    }


//It updates how many monsters are currently in the game
//It prints the monster's name and whether it's alive or dead


        //do not change function sayName. It is implemented for you
        static public void sayName() {
            System.out.println("You can call me Monster " + name + " if you're nice!");
        }

    //function attack takes 2 parameters: the monster to attack and how many many health points the attacked monster loses when attacked
    public void attack(Monster monster, int healthPoints) {
//print the name of the monster being attacked,
        System.out.println(monster);
        // lower its health, print it's health
        System.out.println(healthPoints);

    }


        public static void main (String[]args){
//Test your monster object before moving on

//create a monster1 object and set it's name
//make it tell you who it is
//set the monster's health and check to see if it was set
//how many monsters have been created?
//create a monster2 object
//how many monsters have been created?
//make monster1 attack monster 2
//check to see if monster 2 is alive
//if it is, attack it again until it's dead
//how many monsters are left?
        }

    }

