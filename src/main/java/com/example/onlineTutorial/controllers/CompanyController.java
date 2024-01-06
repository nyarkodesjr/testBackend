package com.example.onlineTutorial.controllers;

import com.example.onlineTutorial.OnlineTutorialApplication;
import com.example.onlineTutorial.entities.Company;
import com.example.onlineTutorial.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CompanyController {
    public static void main(String[] args) {
        SpringApplication.run(OnlineTutorialApplication.class, args);
        System.out.println("hello world from company controller");
    }

    private final CompanyRepository companyRepository;
    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/api/companies")
    public List<Company>getAllCompanies(){
        return companyRepository.findAll();
    }
    @DeleteMapping("/api/company/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
        System.out.println("================the user entered id "+id);
        companyRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
