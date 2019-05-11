package edu.osucascades.guevarra;
import java.util.ArrayList;
public class Zombie extends Monster {
    public  String name;
    public int health;

    public Zombie(){
        this.name = "Default Name";
        this.health = 0;
    }
    public Zombie(String name){
        this.name = name;
        this.health = 0;
    }
    public Zombie(String name, int zombieHealth){
        this.name = name;
        this.health = zombieHealth;


    }


    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void makeNoise(){
        System.out.println("I'm going to eat your brains");

    }

    public void favoriteSong(){
      System.out.println("Generic Song");
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Now with an arraylist");
        ArrayList<Zombie> zombies = new ArrayList<Zombie>();
        Zombie singingZombie = new SingingZombie("Janet");
        zombies.add(singingZombie);
        singingZombie.sayName();
        singingZombie.makeNoise();
        singingZombie.favoriteSong();
        Zombie whisperingZombie = new WhisperingZombie("Jeffree");
        zombies.add(whisperingZombie);
        whisperingZombie.sayName();
        whisperingZombie.makeNoise();
        Zombie groaningZombie = new GroaningZombie("Jasmine");
        zombies.add(groaningZombie);
        groaningZombie.sayName();
        groaningZombie.makeNoise();
        Zombie shoutingZombie = new ShoutingZombie("Jeremy");
        zombies.add(shoutingZombie);
        shoutingZombie.sayName();
        shoutingZombie.makeNoise();



    }

}
