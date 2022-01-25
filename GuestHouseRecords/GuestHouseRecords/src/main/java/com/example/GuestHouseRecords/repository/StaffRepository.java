package com.example.GuestHouseRecords.repository;

import com.example.GuestHouseRecords.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}