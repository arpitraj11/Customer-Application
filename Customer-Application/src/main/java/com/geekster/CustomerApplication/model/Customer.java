package com.geekster.CustomerApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
    @Id
    private Long customerId;
    private String customerfirstName;
    private String customerlastName;
    private String customerstreet;
    private String customeraddress;
    private String customercity;
    private String customerstate;
    private String customeremail;
    private String customerphone;
}
