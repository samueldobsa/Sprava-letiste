package org.example.entity;

public class PassengerPlaneFlight extends AbstractAircraftFlight {

    int numberOfSeats;
    String seatType;

    public PassengerPlaneFlight(String flightNumber, String destination, int passengerCapacity, int numberOfSeats, String seatType) {
        super(flightNumber, destination, passengerCapacity);
        this.numberOfSeats = numberOfSeats;
        this.seatType = seatType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "\n PassengerPlaneFlight: " +
                "\n Flight Number = " + flightNumber +
                "\n Number of seats = " + numberOfSeats +
                "\n Seat Type = " + seatType +
                "\n Destination = " + destination +
                "\n Passenger capacity = " + passengerCapacity;
    }
}
