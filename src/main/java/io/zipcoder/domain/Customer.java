package io.zipcoder.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String first_name;

    private String last_name;

    private Set<Address> address;

    public Customer(String first_name, String last_name, Set<Address> address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}
