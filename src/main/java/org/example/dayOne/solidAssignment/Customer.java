package org.example.dayOne.solidAssignment;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private String email;
    private String address;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Map<String, String> getContactInfo() {
        Map<String, String> contactInfo = new HashMap<>();
        contactInfo.put("Name", name);
        contactInfo.put("Email", email);
        contactInfo.put("Address", address);

        return contactInfo;
    }
}
