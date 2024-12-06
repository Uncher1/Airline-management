package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String registration;
    private String model;
    private int capacity;

    // Liste pour stocker les vols assignés
    final private List<String> assignedFlights = new ArrayList<>();

    // Constructeur
    public Aircraft(String registration, String model, int capacity) {
        this.registration = registration;
        this.model = model;
        this.capacity = capacity;
    }

    // Méthodes spécifiques
    public void assignFlight(String flightNumber) {
        assignedFlights.add(flightNumber);
        System.out.println("Flight " + flightNumber + " assigned to aircraft " + registration);
    }

    public boolean checkAvailability(String flightNumber) {
        return !assignedFlights.contains(flightNumber);
    }

    // Getters et setters
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getAssignedFlights() {
        return assignedFlights;
    }

    // Méthodes CRUD
    final private static List<Aircraft> aircraftList = new ArrayList<>();

    public static void createAircraft(String registration, String model, int capacity) {
        Aircraft aircraft = new Aircraft(registration, model, capacity);
        aircraftList.add(aircraft);
        System.out.println("Aircraft created successfully!");
    }

    public static void readAircraft(String registration) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getRegistration().equals(registration)) {
                System.out.println("Registration: " + aircraft.getRegistration());
                System.out.println("Model: " + aircraft.getModel());
                System.out.println("Capacity: " + aircraft.getCapacity());
                System.out.println("Assigned Flights: " + aircraft.getAssignedFlights());
                return;
            }
        }
        System.out.println("Aircraft not found!");
    }

    public static void updateAircraft(String registration, String model, int capacity) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getRegistration().equals(registration)) {
                aircraft.setModel(model);
                aircraft.setCapacity(capacity);
                System.out.println("Aircraft updated successfully!");
                return;
            }
        }
        System.out.println("Aircraft not found!");
    }

    public static void deleteAircraft(String registration) {
        for (int i = 0; i < aircraftList.size(); i++) {
            if (aircraftList.get(i).getRegistration().equals(registration)) {
                aircraftList.remove(i);
                System.out.println("Aircraft deleted successfully!");
                return;
            }
        }
        System.out.println("Aircraft not found!");
    }
}
