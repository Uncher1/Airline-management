package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String reservationNumber;
    private String dateReservation;
    private String status; // e.g., "Confirmed", "Cancelled", "Pending"

    // Constructeur
    public Book(String reservationNumber, String dateReservation, String status) {
        this.reservationNumber = reservationNumber;
        this.dateReservation = dateReservation;
        this.status = status;
    }

    // Méthodes spécifiques
    public void confirmReservation() {
        if (!status.equals("Confirmed")) {
            status = "Confirmed";
            System.out.println("Reservation " + reservationNumber + " confirmed.");
        } else {
            System.out.println("Reservation " + reservationNumber + " is already confirmed.");
        }
    }

    public void cancelReservation() {
        if (!status.equals("Cancelled")) {
            status = "Cancelled";
            System.out.println("Reservation " + reservationNumber + " cancelled.");
        } else {
            System.out.println("Reservation " + reservationNumber + " is already cancelled.");
        }
    }

    public void modifyReservation(String newDate) {
        this.dateReservation = newDate;
        System.out.println("Reservation " + reservationNumber + " updated to new date: " + newDate);
    }

    // Getters et setters
    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Méthodes CRUD
    final private static List<Book> bookList = new ArrayList<>();

    public static void createBook(String reservationNumber, String dateReservation, String status) {
        Book book = new Book(reservationNumber, dateReservation, status);
        bookList.add(book);
        System.out.println("Book created successfully!");
    }

    public static void readBook(String reservationNumber) {
        for (Book book : bookList) {
            if (book.getReservationNumber().equals(reservationNumber)) {
                System.out.println("Reservation Number: " + book.getReservationNumber());
                System.out.println("Date Reservation: " + book.getDateReservation());
                System.out.println("Status: " + book.getStatus());
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public static void updateBook(String reservationNumber, String dateReservation, String status) {
        for (Book book : bookList) {
            if (book.getReservationNumber().equals(reservationNumber)) {
                book.setDateReservation(dateReservation);
                book.setStatus(status);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public static void deleteBook(String reservationNumber) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getReservationNumber().equals(reservationNumber)) {
                bookList.remove(i);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
