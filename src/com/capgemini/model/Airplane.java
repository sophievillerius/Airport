package com.capgemini.model;

public class Airplane {
    private String planeIdentification;
    private boolean isCurrentlyFlying;
    private double cruiseSpeed;
    private int maxNumberOfPassengers;
    private int currentNumberOfPassengers;

    public Airplane(String planeIdentification, int maxNumberOfPassengers) {
        this.planeIdentification = planeIdentification;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public void loadPassengers (int numberOfPassengers) {
        if (this.currentNumberOfPassengers + numberOfPassengers <= this.maxNumberOfPassengers) {
            this.currentNumberOfPassengers += numberOfPassengers;
            System.out.println("Airplane " + this.getPlaneIdentification() + " loads " + numberOfPassengers + " passengers. " +
                    "There are now " + this.currentNumberOfPassengers + " passengers on board.");
        }
        else {
            int numberOfPassengersLoaded = this.maxNumberOfPassengers - this.currentNumberOfPassengers;
            int numberOfPassengersNotLoaded = numberOfPassengers - numberOfPassengersLoaded;
            this.currentNumberOfPassengers += numberOfPassengersLoaded;
            System.out.println("Airplane " + this.getPlaneIdentification() + " loads " + numberOfPassengersLoaded + " passengers, " +
                    numberOfPassengersNotLoaded + " do not fit. There are now " + this.currentNumberOfPassengers + " passengers on board.");
        }
    }

    public void unloadPassengers (int numberOfPassengers) {
        if (numberOfPassengers <= this.currentNumberOfPassengers) {
            this.currentNumberOfPassengers = this.currentNumberOfPassengers - numberOfPassengers;
            System.out.println("Airplane " + this.getPlaneIdentification() + " unloads " + numberOfPassengers + " passengers." +
                    " There are now " + this.currentNumberOfPassengers + " passengers on board.");
        }
        else {
            int numberOfPassengersUnloaded = this.currentNumberOfPassengers;
            int numberOfPassengersNotUnloaded = numberOfPassengers - this.currentNumberOfPassengers;
            this.currentNumberOfPassengers -= numberOfPassengersUnloaded;
            System.out.println("The number of passengers cannot be negative. Airplane " + this.getPlaneIdentification() + " unloads " +
                    numberOfPassengersUnloaded + " passengers and there are now " + this.currentNumberOfPassengers + " passengers on board.");
        }
    }

    public int roomForPassengers() {
        return (this.maxNumberOfPassengers-this.currentNumberOfPassengers);
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
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
