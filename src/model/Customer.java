package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    // Instance variables
    private String firstName;
    private String lastName;
    private String email;
    private static final Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.com$", Pattern.CASE_INSENSITIVE);

    // Constructor
    public Customer(String firstName, String lastName, String email) {
        try {
           boolean isValidEmail = validate(email);
           if(isValidEmail) {
               this.firstName = firstName;
               this.lastName = lastName;
               this.email = email;
           } else {
               throw new IllegalArgumentException();
           }
        } catch(IllegalArgumentException exception) {
            System.out.println(exception.toString());
        }
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    // Methods
    public static boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    // To string method
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
