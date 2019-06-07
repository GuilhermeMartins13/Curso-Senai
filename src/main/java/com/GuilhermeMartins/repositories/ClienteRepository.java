package com.GuilhermeMartins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GuilhermeMartins.domain.Estado;

@Repository
public interface ClienteRepository extends JpaRepository<Estado, Integer>{

}
