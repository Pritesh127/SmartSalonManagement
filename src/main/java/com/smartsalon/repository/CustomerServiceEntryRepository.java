package com.smartsalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartsalon.entity.CustomerEntryEntity;

@Repository
public interface CustomerServiceEntryRepository extends JpaRepository<CustomerEntryEntity, Integer>{

}
