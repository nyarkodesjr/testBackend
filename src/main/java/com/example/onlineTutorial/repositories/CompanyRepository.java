package com.example.onlineTutorial.repositories;

import com.example.onlineTutorial.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository  extends JpaRepository<Company,Long> {
}
