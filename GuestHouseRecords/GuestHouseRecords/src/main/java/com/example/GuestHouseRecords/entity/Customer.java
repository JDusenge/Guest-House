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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer cstId;
    @Column(unique = true, nullable = false, length = 20)
    String cstName;
    @Column(nullable = false, length = 40)
    Integer cstPhone;
    Integer cstRoom;
}
