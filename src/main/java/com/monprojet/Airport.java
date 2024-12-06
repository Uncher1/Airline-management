package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private String city;
    private String description;

    final private List<String> assignedFlights = new ArrayList<>();

    public Airport(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }

    public void assignFlight(String flightNumber) {
        assignedFlights.add(flightNumber);
        System.out.println("Flight " + flightNumber + " assigned to airport " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAssignedFlights() {
        return assignedFlights;
    }

    final private static List<Airport> airportList = new ArrayList<>();

    public static void createAirport(String name, String city, String description) {
        Airport airport = new Airport(name, city, description);
        airportList.add(airport);
        System.out.println("Airport created successfully!");
    }

    public static void readAirport(String name) {
        for (Airport airport : airportList) {
            if (airport.getName().equals(name)) {
                System.out.println("Name: " + airport.getName());
                System.out.println("City: " + airport.getCity());
                System.out.println("Description: " + airport.getDescription());
                System.out.println("Assigned Flights: " + airport.getAssignedFlights());
                return;
            }
        }
        System.out.println("Airport not found!");
    }

    public static void updateAirport(String name, String city, String description) {
        for (Airport airport : airportList) {
            if (airport.getName().equals(name)) {
                airport.setCity(city);
                airport.setDescription(description);
                System.out.println("Airport updated successfully!");
                return;
            }
        }
        System.out.println("Airport not found!");
    }

    public static void deleteAirport(String name) {
        for (int i = 0; i < airportList.size(); i++) {
            if (airportList.get(i).getName().equals(name)) {
                airportList.remove(i);
                System.out.println("Airport deleted successfully!");
                return;
            }
        }
        System.out.println("Airport not found!");
    }
}
