package com.GuilhermeMartins.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GuilhermeMartins.domain.Cliente;
import com.GuilhermeMartins.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {


	private ClienteRepository repo;

	public Cliente buscar(Integer idCliente) {
		Optional<Cliente> obj = repo.findById(idCliente);
          return obj.orElseThrow((); -> new ObjectNotFoundException(
        		  "Número de id não encontrado. Id: " + idCliente + "tipo: " + Cliente.class.getName()));
	}
}
