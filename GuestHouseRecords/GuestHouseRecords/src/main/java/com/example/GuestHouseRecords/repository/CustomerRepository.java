package com.example.GuestHouseRecords.repository;

import com.example.GuestHouseRecords.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
