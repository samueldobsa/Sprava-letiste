package org.example.entity;

public class CargoPlaneFlight extends AbstractAircraftFlight {

    int maxWeight;
    String typeOfCargo;

    public CargoPlaneFlight(String flightNumber, String destination, int passengerCapacity, int maxWeight, String typeOfCargo) {
        super(flightNumber, destination, passengerCapacity);
        this.maxWeight = maxWeight;
        this.typeOfCargo = typeOfCargo;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    @Override
    public String toString() {
        return "\n CargoPlaneFlight: " +
                "\n Flight Number = " + flightNumber +
                "\n Max Weight = " + maxWeight +
                "\n Type of cargo = " + typeOfCargo +
                "\n Destination = " + destination +
                "\n Passenger Capacity = " + passengerCapacity;
    }
}
