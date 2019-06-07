package com.GuilhermeMartins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GuilhermeMartins.domain.Estado;

@Repository
public interface EnderecoRepository extends JpaRepository<Estado, Integer>{

}
