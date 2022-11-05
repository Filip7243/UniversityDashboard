package com.fxproject.unidashboard.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public class UniversityEmployee { // ex. secretary etc...

    private String firstName;
    private String secondName;
    private String lastName;
    private String email;
    private String universityEmail; // @stud.uni.empl.pl
    private LocalDateTime dateOfBirth;
    private String placeOfBirth;
    private String phoneNumber;
    private String pesel;

    public UniversityEmployee() {
    }

    public UniversityEmployee(String firstName, String secondName, String lastName, String email, String universityEmail, LocalDateTime dateOfBirth, String placeOfBirth, String phoneNumber, String pesel) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.email = email;
        this.universityEmail = universityEmail;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.phoneNumber = phoneNumber;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "UniversityEmployee{" +
               " name='" + firstName + '\'' +
               ", secondName='" + secondName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               ", universityEmail='" + universityEmail + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               ", placeOfBirth='" + placeOfBirth + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", pesel='" + pesel + '\'' +
               '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniversityEmail() {
        return universityEmail;
    }

    public void setUniversityEmail(String universityEmail) {
        this.universityEmail = universityEmail;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
