package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalDateTime;
    private String status; // e.g., "Scheduled", "Cancelled", "Completed"

    // Liste pour stocker les passagers associés au vol
    final private List<Passenger> passengerList = new ArrayList<>();

    // Constructeur
    public Flight(String flightNumber, String origin, String destination, String departureTime,
                  String arrivalDateTime, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalDateTime = arrivalDateTime;
        this.status = status;
    }

    // Méthodes spécifiques
    public void planFlight() {
        this.status = "Scheduled";
        System.out.println("Flight " + flightNumber + " planned successfully.");
    }

    public void cancelFlight() {
        this.status = "Cancelled";
        System.out.println("Flight " + flightNumber + " cancelled.");
    }

    public void modifyFlight(String origin, String destination, String departureTime, String arrivalDateTime) {
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalDateTime = arrivalDateTime;
        System.out.println("Flight " + flightNumber + " details modified.");
    }

    public void listPassengers() {
        System.out.println("Passengers for Flight " + flightNumber + ":");
        if (passengerList.isEmpty()) {
            System.out.println("No passengers assigned to this flight.");
        } else {
            for (Passenger passenger : passengerList) {
                System.out.println(" - " + passenger.getName() + " (ID: " + passenger.getId() + ")");
            }
        }
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
        System.out.println("Passenger " + passenger.getName() + " added to flight " + flightNumber);
    }

    public void removePassenger(Passenger passenger) {
        if (passengerList.remove(passenger)) {
            System.out.println("Passenger " + passenger.getName() + " removed from flight " + flightNumber);
        } else {
            System.out.println("Passenger not found on flight " + flightNumber);
        }
    }

    // Getters et setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    // Méthodes CRUD
    final private static List<Flight> flightList = new ArrayList<>();

    public static void createFlight(String flightNumber, String origin, String destination,
                                    String departureTime, String arrivalDateTime, String status) {
        Flight flight = new Flight(flightNumber, origin, destination, departureTime, arrivalDateTime, status);
        flightList.add(flight);
        System.out.println("Flight created successfully!");
    }

    public static void readFlight(String flightNumber) {
        for (Flight flight : flightList) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                System.out.println("Flight Number: " + flight.getFlightNumber());
                System.out.println("Origin: " + flight.getOrigin());
                System.out.println("Destination: " + flight.getDestination());
                System.out.println("Departure Time: " + flight.getDepartureTime());
                System.out.println("Arrival Time: " + flight.getArrivalDateTime());
                System.out.println("Status: " + flight.getStatus());
                flight.listPassengers();
                return;
            }
        }
        System.out.println("Flight not found!");
    }

    public static void updateFlight(String flightNumber, String origin, String destination,
                                    String departureTime, String arrivalDateTime, String status) {
        for (Flight flight : flightList) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flight.setOrigin(origin);
                flight.setDestination(destination);
                flight.setDepartureTime(departureTime);
                flight.setArrivalDateTime(arrivalDateTime);
                flight.setStatus(status);
                System.out.println("Flight updated successfully!");
                return;
            }
        }
        System.out.println("Flight not found!");
    }

    public static void deleteFlight(String flightNumber) {
        for (int i = 0; i < flightList.size(); i++) {
            if (flightList.get(i).getFlightNumber().equals(flightNumber)) {
                flightList.remove(i);
                System.out.println("Flight deleted successfully!");
                return;
            }
        }
        System.out.println("Flight not found!");
    }
}
