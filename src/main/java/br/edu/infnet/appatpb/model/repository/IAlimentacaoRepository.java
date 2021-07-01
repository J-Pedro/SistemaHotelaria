package br.edu.infnet.appatpb.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatpb.model.negocio.Acomodacao;
import br.edu.infnet.appatpb.model.negocio.Alimentacao;
import br.edu.infnet.appatpb.model.negocio.Passeio;
import br.edu.infnet.appatpb.model.negocio.Usuario;

@Repository
public interface IAlimentacaoRepository extends CrudRepository<Alimentacao, Integer>{
	@Query("from Alimentacao")
	public List<Alimentacao> obterListaAlimentacaoByRefeicao(Sort sort);
}
