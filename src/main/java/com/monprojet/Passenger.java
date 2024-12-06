package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {
    private String passport;

    final private List<String> bookedFlights = new ArrayList<>();

    public Passenger(String id, String name, String address, String contact, String passport) {
        super(id, name, address, contact);
        this.passport = passport;
    }

    public void bookFlight(String flightNumber) {
        bookedFlights.add(flightNumber);
        System.out.println("Flight " + flightNumber + " booked for passenger " + getName());
    }

    public void cancelFlight(String flightNumber) {
        if (bookedFlights.remove(flightNumber)) {
            System.out.println("Flight " + flightNumber + " canceled for passenger " + getName());
        } else {
            System.out.println("Flight " + flightNumber + " not found in bookings for passenger " + getName());
        }
    }

    public List<String> getBookings() {
        return bookedFlights;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    final private static List<Passenger> passengerList = new ArrayList<>();

    public static void createPassenger(String id, String name, String address, String contact, String passport) {
        Passenger passenger = new Passenger(id, name, address, contact, passport);
        passengerList.add(passenger);
        System.out.println("Passenger created successfully!");
    }

    public static void readPassenger(String id) {
        for (Passenger passenger : passengerList) {
            if (passenger.getId().equals(id)) {
                System.out.println(passenger.getInfos());
                System.out.println("Passport: " + passenger.getPassport());
                System.out.println("Booked Flights: " + passenger.getBookings());
                return;
            }
        }
        System.out.println("Passenger not found!");
    }

    public static void updatePassenger(String id, String name, String address, String contact, String passport) {
        for (Passenger passenger : passengerList) {
            if (passenger.getId().equals(id)) {
                passenger.setName(name);
                passenger.setAddress(address);
                passenger.setContact(contact);
                passenger.setPassport(passport);
                System.out.println("Passenger updated successfully!");
                return;
            }
        }
        System.out.println("Passenger not found!");
    }

    public static void deletePassenger(String id) {
        for (int i = 0; i < passengerList.size(); i++) {
            if (passengerList.get(i).getId().equals(id)) {
                passengerList.remove(i);
                System.out.println("Passenger deleted successfully!");
                return;
            }
        }
        System.out.println("Passenger not found!");
    }
}
