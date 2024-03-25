package com.microservicioslitethinking.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private Long iduser;
    @Column
    @Size(max=10)
    private String number;
    @Column
    @Size(max=16)
    private String associated_card;
    @Size(max=4)
    private String pin;
    private Float balance;
    private Date opening_date;
}
