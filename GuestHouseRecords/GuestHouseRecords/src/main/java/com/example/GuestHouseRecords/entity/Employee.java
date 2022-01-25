package com.example.GuestHouseRecords.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 20)
    Integer empId;
    @Column(nullable = false, length = 40)
    String empfName;
    @Column(nullable = false, length = 40)
    String emplName;
    String empRole;
}