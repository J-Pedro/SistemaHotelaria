package br.edu.infnet.appatpb.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Usuario;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{

}
