package edu.osucascades.guevarra;

public class ShoutingZombie extends Zombie {


    ShoutingZombie(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("WUUUUGH! You've got fair warning!");
    }

//    public static sayName(){
//        System.out.p
//    }

}
