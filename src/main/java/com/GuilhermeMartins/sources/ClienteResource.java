package com.GuilhermeMartins.sources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GuilhermeMartins.Services.ClienteService;
import com.GuilhermeMartins.domain.Cliente;

public class ClienteResource {
	
	@RestController
	@Requestmapping(value="/clientes")
	public class ClienteResource {
		
		@Autowired
		private ClienteService service;
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<Cliente> find(@PathVariable Integer id) {
			Cliente obj = service.buscar(id);
			return ResponseEntity.ok().body(obj);
		}
	}

}