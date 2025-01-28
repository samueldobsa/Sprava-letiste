package org.example;

import org.example.entity.CargoPlaneFlight;
import org.example.entity.PassengerPlaneFlight;
import org.example.impl.Flight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PassengerPlaneFlight passengerPlaneFlight1 = new PassengerPlaneFlight("PSFL001", "Bratislava", 355, 400, "Economy");
        PassengerPlaneFlight passengerPlaneFlight2 = new PassengerPlaneFlight("PSFL002", "Praha", 283, 300, "Economy");
        PassengerPlaneFlight passengerPlaneFlight3 = new PassengerPlaneFlight("PSFL003", "Vienna", 324, 400, "Economy");

        CargoPlaneFlight cargoPlaneFlight1 = new CargoPlaneFlight("CAFL001", "Praha", 10, 40000, "Food");
        CargoPlaneFlight cargoPlaneFlight2 = new CargoPlaneFlight("CAFL002", "Vienna", 4, 50000, "Watter");
        CargoPlaneFlight cargoPlaneFlight3 = new CargoPlaneFlight("CAFL003", "Bratislava", 12, 80000, "Wood");

        List<Flight> flights = new ArrayList<>();
        flights.add(passengerPlaneFlight1);
        flights.add(passengerPlaneFlight2);
        flights.add(passengerPlaneFlight3);

        flights.add(cargoPlaneFlight1);
        flights.add(cargoPlaneFlight2);
        flights.add(cargoPlaneFlight3);

        System.out.println("======= List of flights: =======");
        flights.forEach(System.out::println);

        System.out.println("\n======= Number of passengers: =======");
        System.out.println("On the board are: " + passengerPlaneFlight1.getPassengerCount() + " passengers from full " + passengerPlaneFlight1.getNumberOfSeats());

        System.out.println("\n======= Info about CARGO flights =======");
        for (Flight flight : flights) {
            if (flight instanceof CargoPlaneFlight) {
                System.out.println("Flight Number: " + flight.getFlightNumber() +
                        ", Destination: " + flight.getDestination() +
                        ", Cargo: " + ((CargoPlaneFlight) flight).getTypeOfCargo()
                );
            }
        }

        System.out.println("\n ======= Info about PASSENGER plane flights =======");
        for (Flight flight : flights) {
            if (flight instanceof PassengerPlaneFlight) {
                System.out.println("Flight number: " + flight.getFlightNumber() +
                        ", Passenger capacity: " + flight.getPassengerCount() +
                        ", Number of Seats: " + ((PassengerPlaneFlight) flight).getNumberOfSeats() +
                        ", Type of seats: " + ((PassengerPlaneFlight) flight).getSeatType()
                        );
            }
        }

    }
}