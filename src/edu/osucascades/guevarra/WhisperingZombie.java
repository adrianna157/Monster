package edu.osucascades.guevarra;

public class WhisperingZombie extends Zombie {


    WhisperingZombie(String name) {
       super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("shhhh. No noise here. Nothing to fear?!");
    }

//    public static sayName(){
//        System.out.p
//    }

}
