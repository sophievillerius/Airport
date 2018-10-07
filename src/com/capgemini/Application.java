package com.capgemini;

import com.capgemini.model.Airplane;
import com.capgemini.model.Airport;
import com.capgemini.model.CargoPlane;
import com.capgemini.model.PeoplePlane;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        PeoplePlane airplane1 = new PeoplePlane("Sophie123", 75);
        PeoplePlane airplane2 = new PeoplePlane("Davide193", 60);
        PeoplePlane airplane3 = new PeoplePlane("Amsterdam020", 120);

        CargoPlane airplane4 = new CargoPlane("FF2134", 50);
        CargoPlane airplane5 = new CargoPlane("PLA166", 40);

        airplane1.loadPassengers(43);
        airplane1.takeOff();
        airplane2.loadPassengers(23);
        airplane1.land();
        airplane1.land();
        airplane1.unloadPassengers(13);
        airplane2.takeOff();
        airplane2.takeOff();
//        airplane2.land();
        airplane3.takeOff();
        airplane1.loadPassengers(98);
        airplane2.unloadPassengers(100);

        Airport eindhoven = new Airport("Eindhoven");
        eindhoven.getAirplanes().add(airplane1);
        eindhoven.getAirplanes().add(airplane2);
        eindhoven.getAirplanes().add(airplane3);
        eindhoven.getAirplanes().add(airplane4);
        eindhoven.getAirplanes().add(airplane5);


        eindhoven.requestPeoplePlanes();
        eindhoven.requestCargoPlanes();
        eindhoven.requestPeoplePlane();
        eindhoven.requestCargoPlane();
        airplane4.loadCargo(50);
        eindhoven.requestCargoPlane();
        ((PeoplePlane)eindhoven.getAirplanes().get(2)).loadPassengers(135);



    }
}
