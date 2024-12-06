package com.monprojet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Menu interactif
        while (running) {
            System.out.println("\n-- Airline Reservation System --");
            System.out.println("1. Create Person");
            System.out.println("2. Create Employee");
            System.out.println("3. Create Airplane Pilot");
            System.out.println("4. Create Staff Cabin");
            System.out.println("5. Create Passenger");
            System.out.println("6. Create Aircraft");
            System.out.println("7. Create Book");
            System.out.println("8. Create Flight");
            System.out.println("9. Create Airport");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String personId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String personName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String personAddress = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String personContact = scanner.nextLine();
                    Person.createPerson(personId, personName, personAddress, personContact);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String empId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String empAddress = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String empContact = scanner.nextLine();
                    System.out.print("Enter Employee Number: ");
                    String empNumber = scanner.nextLine();
                    System.out.print("Enter Hiring Date: ");
                    String empHiringDate = scanner.nextLine();
                    Employee.createEmployee(empId, empName, empAddress, empContact, empNumber, empHiringDate);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String pilotId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String pilotName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String pilotAddress = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String pilotContact = scanner.nextLine();
                    System.out.print("Enter Employee Number: ");
                    String pilotEmpNumber = scanner.nextLine();
                    System.out.print("Enter Hiring Date: ");
                    String pilotHiringDate = scanner.nextLine();
                    System.out.print("Enter License: ");
                    String pilotLicense = scanner.nextLine();
                    System.out.print("Enter Flight Hours: ");
                    int flightHours = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    AirplanePilot.createAirplanePilot(pilotId, pilotName, pilotAddress, pilotContact,
                            pilotEmpNumber, pilotHiringDate, pilotLicense, flightHours);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    String cabinId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String cabinName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String cabinAddress = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String cabinContact = scanner.nextLine();
                    System.out.print("Enter Employee Number: ");
                    String cabinEmpNumber = scanner.nextLine();
                    System.out.print("Enter Hiring Date: ");
                    String cabinHiringDate = scanner.nextLine();
                    System.out.print("Enter Qualification: ");
                    String cabinQualification = scanner.nextLine();
                    StaffCabin.createStaffCabin(cabinId, cabinName, cabinAddress, cabinContact,
                            cabinEmpNumber, cabinHiringDate, cabinQualification);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    String passengerId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String passengerName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String passengerAddress = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String passengerContact = scanner.nextLine();
                    System.out.print("Enter Passport: ");
                    String passport = scanner.nextLine();
                    Passenger.createPassenger(passengerId, passengerName, passengerAddress, passengerContact, passport);
                    break;

                case 6:
                    System.out.print("Enter Registration: ");
                    String registration = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Aircraft.createAircraft(registration, model, capacity);
                    break;

                case 7:
                    System.out.print("Enter Reservation Number: ");
                    String reservationNumber = scanner.nextLine();
                    System.out.print("Enter Date Reservation: ");
                    String dateReservation = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();
                    Book.createBook(reservationNumber, dateReservation, status);
                    break;

                case 8:
                    System.out.print("Enter Flight Number: ");
                    String flightNumber = scanner.nextLine();
                    System.out.print("Enter Origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter Departure Time: ");
                    String departureTime = scanner.nextLine();
                    System.out.print("Enter Arrival DateTime: ");
                    String arrivalDateTime = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String flightStatus = scanner.nextLine();
                    Flight.createFlight(flightNumber, origin, destination, departureTime, arrivalDateTime, flightStatus);
                    break;

                case 9:
                    System.out.print("Enter Airport Name: ");
                    String airportName = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    Airport.createAirport(airportName, city, description);
                    break;

                case 10:
                    running = false;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid option! Please choose a valid number.");
            }
        }

        scanner.close();
    }
}
