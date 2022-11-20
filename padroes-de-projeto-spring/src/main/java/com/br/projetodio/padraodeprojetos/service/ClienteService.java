package com.br.projetodio.padraodeprojetos.service;

import com.br.projetodio.padraodeprojetos.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente  buscarPorId(Long id);
    void inserirCliente(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
