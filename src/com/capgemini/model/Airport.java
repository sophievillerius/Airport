package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private ArrayList<Airplane> airplanes = new ArrayList<>();

    public Airport(String airportName) {
        this.name = airportName;
    }

    public ArrayList<Airplane> getAirplanes() {
        return this.airplanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public void printAirplanes() {
        System.out.println("Passenger planes from airport " + this.name + ":");
        for (Airplane i : this.airplanes) {
            if (i instanceof PeoplePlane) {
                System.out.println(i.toString());
            }
        }
        System.out.println("\nCargo planes from airport " + this.name + ":");
        for (Airplane i : this.airplanes) {
            if (i instanceof CargoPlane) {
                System.out.println(i.toString());
            }
        }
    }

    public void requestPeoplePlanes() {
        System.out.println("Passenger planes from airport " + this.name + ":");
        for (Airplane i : this.airplanes) {
            if (i instanceof PeoplePlane) {
                System.out.println(i.toString());
            }
        }
    }

    public void requestCargoPlanes() {
        System.out.println("\nCargo planes from airport " + this.name + ":");
        for (Airplane i : this.airplanes) {
            if (i instanceof CargoPlane) {
                System.out.println(i.toString());
            }
        }
    }

    public void requestPeoplePlane() {
        for (Airplane i: this.airplanes) {
            if (i instanceof PeoplePlane) {
                if (!i.isCurrentlyFlying() && ((PeoplePlane)i).roomForPassengers() > 0) {
                    System.out.println("Airplane " + i.getPlaneIdentification() + " is requested. Is not flying, and has room for " +
                            ((PeoplePlane)i).roomForPassengers() + " passengers.");
                    break;
                }
            }
        }
    }

    public void requestCargoPlane() {
        for (Airplane i: this.airplanes) {
            if (i instanceof CargoPlane) {
                if (!i.isCurrentlyFlying() && ((CargoPlane)i).roomForCargo() > 0) {
                    System.out.println("Airplane " + i.getPlaneIdentification() + " is requested. Is not flying, and has room for " +
                            ((CargoPlane)i).roomForCargo() + " tons of freight.");
                    break;
                }
            }
        }
    }
}
