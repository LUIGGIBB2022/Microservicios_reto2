package com.microservicioslitethinking.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String name;
    private String password;
    @Size(max=20)
    private String identification;
    @Size(max=10)
    private String type;

}