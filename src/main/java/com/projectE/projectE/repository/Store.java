package com.projectE.projectE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectE.projectE.model.EDetails;

public interface Store extends JpaRepository<EDetails, Long>{

}
