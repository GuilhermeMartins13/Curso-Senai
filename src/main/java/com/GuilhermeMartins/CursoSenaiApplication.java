package com.GuilhermeMartins;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GuilhermeMartins.domain.Cliente;
import com.GuilhermeMartins.domain.Endereco;
import com.GuilhermeMartins.domain.Estado;
import com.GuilhermeMartins.domain.enuns.TipoCliente;
import com.GuilhermeMartins.repositories.CidadeRepository;
import com.GuilhermeMartins.repositories.ClienteRepository;
import com.GuilhermeMartins.repositories.EnderecoRepository;
import com.GuilhermeMartins.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired 
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		estadoRepository.saveAll(Arrays.asList(est1, est2));

		Cliente cli1 = new Cliente(null, "Igor Lopes", "12309875674", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli2 = new Cliente(null, "Lennyng", "12309875554", "c.lennyng@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("4525483339", "45488814534"));

		Cliente cli3 = new Cliente(null, "Marco Tulio", "1230981545", "c.marcotulio@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli4 = new Cliente(null, "Ti Girso", "12309856214", "c.Yanmarcelo@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli5 = new Cliente(null, "Ederson Yan", "12309875674", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli6 = new Cliente(null, "Vitor Neres", "12309875674", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli7 = new Cliente(null, "Igor Vatuggo", "12309864887", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli8 = new Cliente(null, " Crispim Luiz", "12309875674", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli9 = new Cliente(null, "Ryan Praddo", "12309875674", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));

		Cliente cli10 = new Cliente(null, "Marlon Santos", "12309875674", "c.igorlopes@hotmail.com.br",
				TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("4525484489", "45488855484"));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10));


		Endereco e1 = new Endereco(null, "Ruas dos Emboabas","1",null, "Jardim","38447587",cli1,c1);
		Endereco e2 = new Endereco(null, "Ruas dos Carajas","2",null, "Jardim","38147587",cli2,c2);
		Endereco e3 = new Endereco(null, "Ruas dos Emboabas","3",null, "Jardim","38487454",cli3,c3);
		Endereco e4 = new Endereco(null, "Ruas dos Emboabas","4",null, "Jardim","38451237",cli4,c4);
		Endereco e5 = new Endereco(null, "Ruas dos Carajas","2",null, "Jardim","38147857",cli5,c5);
		Endereco e6 = new Endereco(null, "Ruas dos Carajas","3",null, "Jardim","38147587",cli6,c6);
		Endereco e7 = new Endereco(null, "Ruas dos Emboabas","2",null, "Jardim","38433387",cli7,c7);
		Endereco e8 = new Endereco(null, "Ruas dos Carajas","4",null, "Jardim","38147587",cli8,c8);
		Endereco e9 = new Endereco(null, "Ruas dos Emboabas","5",null, "Jardim","38447587",cli9,c9);
		Endereco e10 = new Endereco(null, "Ruas dos Carajas","5",null, "Jardim","38147587",cli10,c10);
		

		enderecoRepository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));

	} 

}