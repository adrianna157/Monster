package edu.osucascades.guevarra;

public class SingingZombie extends Zombie {
    public static String favoriteSong;
    public static String name;

    public SingingZombie(String name){
        super(name);

    }
//    public SingingZombie(String name){
//        this.name = name;
//
//    }

    @Override
    public void makeNoise(){
        System.out.println("You may say I'm a dreamer, but I'm not the only one" );
    }

    @Override
    public void favoriteSong(){
        System.out.println("My favorite song is I'm a survivor");
    }


}
