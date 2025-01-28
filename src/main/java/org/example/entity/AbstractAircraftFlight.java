package org.example.entity;

import org.example.impl.Flight;

abstract class AbstractAircraftFlight implements Flight {

    String flightNumber;
    String destination;
    int passengerCapacity;

    public AbstractAircraftFlight(String flightNumber, String destination, int passengerCapacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public int getPassengerCount() {
        return passengerCapacity;
    }


}
