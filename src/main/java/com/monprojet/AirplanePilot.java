package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class AirplanePilot extends Employee {
    private String license;
    private int flightHours;

    // Liste pour stocker les vols assignés
    final private List<String> assignedFlights = new ArrayList<>();

    // Constructeur
    public AirplanePilot(String id, String name, String address, String contact, String numberEmp,
                         String hiringDate, String license, int flightHours) {
        super(id, name, address, contact, numberEmp, hiringDate);
        this.license = license;
        this.flightHours = flightHours;
    }

    // Méthode pour obtenir le rôle
    @Override
    public String getRole() {
        return "Airplane Pilot";
    }

    // Méthodes spécifiques
    public void assignFlight(String flightNumber) {
        assignedFlights.add(flightNumber);
        System.out.println("Flight " + flightNumber + " assigned to pilot " + getName());
    }

    public List<String> obtainVol() {
        return assignedFlights;
    }

    // Getters et setters
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

    // Méthodes CRUD
    final private static List<AirplanePilot> pilotList = new ArrayList<>();

    public static void createAirplanePilot(String id, String name, String address, String contact,
                                           String numberEmp, String hiringDate, String license, int flightHours) {
        AirplanePilot pilot = new AirplanePilot(id, name, address, contact, numberEmp, hiringDate, license, flightHours);
        pilotList.add(pilot);
        System.out.println("Airplane Pilot created successfully!");
    }

    public static void readAirplanePilot(String id) {
        for (AirplanePilot pilot : pilotList) {
            if (pilot.getId().equals(id)) {
                System.out.println(pilot.getInfos());
                System.out.println("Employee Number: " + pilot.getNumberEmp());
                System.out.println("Hiring Date: " + pilot.getHiringDate());
                System.out.println("License: " + pilot.getLicense());
                System.out.println("Flight Hours: " + pilot.getFlightHours());
                System.out.println("Role: " + pilot.getRole());
                System.out.println("Assigned Flights: " + pilot.obtainVol());
                return;
            }
        }
        System.out.println("Airplane Pilot not found!");
    }

    public static void updateAirplanePilot(String id, String name, String address, String contact,
                                           String numberEmp, String hiringDate, String license, int flightHours) {
        for (AirplanePilot pilot : pilotList) {
            if (pilot.getId().equals(id)) {
                pilot.setName(name);
                pilot.setAddress(address);
                pilot.setContact(contact);
                pilot.setNumberEmp(numberEmp);
                pilot.setHiringDate(hiringDate);
                pilot.setLicense(license);
                pilot.setFlightHours(flightHours);
                System.out.println("Airplane Pilot updated successfully!");
                return;
            }
        }
        System.out.println("Airplane Pilot not found!");
    }

    public static void deleteAirplanePilot(String id) {
        for (int i = 0; i < pilotList.size(); i++) {
            if (pilotList.get(i).getId().equals(id)) {
                pilotList.remove(i);
                System.out.println("Airplane Pilot deleted successfully!");
                return;
            }
        }
        System.out.println("Airplane Pilot not found!");
    }
}
