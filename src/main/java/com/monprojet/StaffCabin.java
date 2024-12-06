package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class StaffCabin extends Employee {
    private String qualification;

    // Liste pour stocker les vols assignés
    final private List<String> assignedFlights = new ArrayList<>();

    // Constructeur
    public StaffCabin(String id, String name, String address, String contact, String numberEmp,
                      String hiringDate, String qualification) {
        super(id, name, address, contact, numberEmp, hiringDate);
        this.qualification = qualification;
    }

    // Méthode pour obtenir le rôle
    @Override
    public String getRole() {
        return "Staff Cabin";
    }

    // Méthodes spécifiques
    public void assignFlight(String flightNumber) {
        assignedFlights.add(flightNumber);
        System.out.println("Flight " + flightNumber + " assigned to cabin staff " + getName());
    }

    public List<String> obtainVol() {
        return assignedFlights;
    }

    // Getters et setters
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Méthodes CRUD
    final private static List<StaffCabin> staffCabinList = new ArrayList<>();

    public static void createStaffCabin(String id, String name, String address, String contact,
                                        String numberEmp, String hiringDate, String qualification) {
        StaffCabin staffCabin = new StaffCabin(id, name, address, contact, numberEmp, hiringDate, qualification);
        staffCabinList.add(staffCabin);
        System.out.println("Staff Cabin created successfully!");
    }

    public static void readStaffCabin(String id) {
        for (StaffCabin staff : staffCabinList) {
            if (staff.getId().equals(id)) {
                System.out.println(staff.getInfos());
                System.out.println("Employee Number: " + staff.getNumberEmp());
                System.out.println("Hiring Date: " + staff.getHiringDate());
                System.out.println("Qualification: " + staff.getQualification());
                System.out.println("Role: " + staff.getRole());
                System.out.println("Assigned Flights: " + staff.obtainVol());
                return;
            }
        }
        System.out.println("Staff Cabin not found!");
    }

    public static void updateStaffCabin(String id, String name, String address, String contact,
                                        String numberEmp, String hiringDate, String qualification) {
        for (StaffCabin staff : staffCabinList) {
            if (staff.getId().equals(id)) {
                staff.setName(name);
                staff.setAddress(address);
                staff.setContact(contact);
                staff.setNumberEmp(numberEmp);
                staff.setHiringDate(hiringDate);
                staff.setQualification(qualification);
                System.out.println("Staff Cabin updated successfully!");
                return;
            }
        }
        System.out.println("Staff Cabin not found!");
    }

    public static void deleteStaffCabin(String id) {
        for (int i = 0; i < staffCabinList.size(); i++) {
            if (staffCabinList.get(i).getId().equals(id)) {
                staffCabinList.remove(i);
                System.out.println("Staff Cabin deleted successfully!");
                return;
            }
        }
        System.out.println("Staff Cabin not found!");
    }
}
