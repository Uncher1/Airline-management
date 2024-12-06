package com.monprojet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String id;
    private String name;
    private String address;
    private String contact;

    // Liste statique pour stocker les instances de Person
    final private static List<Person> personList = new ArrayList<>();

    // Constructeur
    public Person(String id, String name, String address, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    // Méthode pour afficher les informations
    public String getInfos() {
        return "ID: " + id + "\nName: " + name + "\nAddress: " + address + "\nContact: " + contact;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // Méthodes CRUD
    public static void createPerson(String id, String name, String address, String contact) {
        Person person = new Person(id, name, address, contact);
        personList.add(person);
        System.out.println("Person created successfully!");
    }

    public static void readPerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                System.out.println(person.getInfos());
                return;
            }
        }
        System.out.println("Person not found!");
    }

    public static void updatePerson(String id, String name, String address, String contact) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.setName(name);
                person.setAddress(address);
                person.setContact(contact);
                System.out.println("Person updated successfully!");
                return;
            }
        }
        System.out.println("Person not found!");
    }

    public static void deletePerson(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
                System.out.println("Person deleted successfully!");
                return;
            }
        }
        System.out.println("Person not found!");
    }
}
