package com.capgemini;

import com.capgemini.model.Airplane;
import com.capgemini.model.Airport;

public class Application {

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Sophie123", 75);
        Airplane airplane2 = new Airplane("Davide193", 60);
        Airplane airplane3 = new Airplane("Amsterdam020", 120);

        airplane1.loadPassengers(43);
        airplane1.takeOff();
        airplane2.loadPassengers(23);
        airplane1.land();
        airplane1.land();
        airplane1.unloadPassengers(13);
        airplane2.takeOff();
        airplane2.takeOff();
        airplane2.land();
        airplane1.loadPassengers(98);
        airplane2.unloadPassengers(100);

        Airport eindhoven = new Airport("Eindhoven", airplane1, airplane2, airplane3);

        eindhoven.printAirplanes();
        eindhoven.requestAirplane();
        eindhoven.getAirplanes()[2].loadPassengers(135);



    }
}
