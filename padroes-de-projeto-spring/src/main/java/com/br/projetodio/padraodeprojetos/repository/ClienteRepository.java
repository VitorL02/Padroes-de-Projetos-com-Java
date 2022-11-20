package com.br.projetodio.padraodeprojetos.repository;

import com.br.projetodio.padraodeprojetos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
