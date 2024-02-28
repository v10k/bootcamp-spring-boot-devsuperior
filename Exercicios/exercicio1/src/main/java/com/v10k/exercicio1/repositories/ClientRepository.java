package com.v10k.exercicio1.repositories;

import com.v10k.exercicio1.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
