package br.edu.infnet.appatpb.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatpb.model.negocio.Reserva;

@Repository
public interface IReservaRepository extends CrudRepository<Reserva, Integer>{
	@Query("from Reserva r where r.usuario.id = :userid")
	public List<Reserva> obterListaUser(Integer userid, Sort sort);
	
}
