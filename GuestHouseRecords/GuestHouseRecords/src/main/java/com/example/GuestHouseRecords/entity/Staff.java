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
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 20)
    Integer stfId;
    @Column(nullable = false, length = 40)
    String stffName;
    @Column(nullable = false, length = 40)
    String stflName;
    String stfRole;
}