package lesson1;
//in Java2 folder, each lesson is represented by separate package

import lesson1.helloWorldLibrary.WorldLibrary;

public class HelloWorld {
    public static void main(String[] args) {

        WorldLibrary theWorld = new WorldLibrary();
        theWorld.setPlanetNam("Earth");

        System.out.println("Happy to see you: " + WorldLibrary.getName());
        System.out.println("I live on a planet: " + theWorld.getPlanetName());

        theWorld.setPlanetNam("Mars");
        System.out.println("But now I decided to go to: " + theWorld.getPlanetName());
    }

}
