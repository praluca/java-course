package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard );
        thePC.powerUp();

        Bed bed = new Bed(2,1,"black");
        Wall wall = new Wall(3,4,"white");
        Desk desk = new Desk("black", 100);

        Room room = new Room(wall, bed, desk);
        System.out.println(room.getBed().getColour());

        room.getArea();

    }
}
