package com.capgemini.model;

public class Airport {
    private String name;
    private Airplane[] airplanes;

    public Airport(String airportName, Airplane airplane1, Airplane airplane2, Airplane airplane3) {
        this.name = airportName;
        this.airplanes = new Airplane[3];
        this.airplanes[0] = airplane1;
        this.airplanes[1] = airplane2;
        this.airplanes[2] = airplane3;
    }

    public Airplane[] getAirplanes() {
        return this.airplanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAirplanes(Airplane[] airplanes) {
        this.airplanes = airplanes;
    }

    public void printAirplanes() {
        System.out.println("Airplanes from airport " + this.name + ":");
        for (Airplane i : this.airplanes) {
            System.out.println("Airplane " + i.getPlaneIdentification());

        }
    }

    public void requestAirplane() {
        for (Airplane i: this.airplanes) {
            if (!i.isCurrentlyFlying() && i.roomForPassengers() > 0) {
                System.out.println("Airplane " + i.getPlaneIdentification() + " is requested. Is not flying, and has room for " +
                        i.roomForPassengers() + " passengers.");
                break;
            }
        }
    }
}
