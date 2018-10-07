package com.capgemini.model;

public class Airplane {
    private String planeIdentification;
    private boolean isCurrentlyFlying;
    private double cruiseSpeed;

    public Airplane(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public String toString() {
        String planeString = "";
        if (this instanceof PeoplePlane) {
            planeString = "Passenger plane " + this.getPlaneIdentification();
        }
        else if (this instanceof CargoPlane) {
            planeString = "Cargo plane " + this.getPlaneIdentification();
        }
        return planeString;
    }

    public void takeOff() {
        if (isCurrentlyFlying) {
            System.out.println(this.planeIdentification + " can not take off, because we are already flying.");
        }
        else {
            isCurrentlyFlying = true;
            System.out.println("Airplane " + this.planeIdentification + " takes off.");
        }
    }

    public void land() {
        if (!isCurrentlyFlying) {
            System.out.println(this.planeIdentification + " can not land, because we are still on the ground.");
        }
        else {
            this.isCurrentlyFlying = false;
            System.out.println("Airplane " + this.planeIdentification + " lands.");
        }
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }


    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        isCurrentlyFlying = currentlyFlying;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }
}
