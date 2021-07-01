package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Acomodacao;
import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IAcomodacaoRepository;
import br.edu.infnet.appatpb.model.repository.IClienteRepository;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class AcomodacaoService {
	
	@Autowired
	private IAcomodacaoRepository acomodacaoRepository;
	
	
	public void incluir(Acomodacao acomodacao) {
		acomodacaoRepository.save(acomodacao);
	}

	public List<Acomodacao> obterLista() {
		
		return (List<Acomodacao>) acomodacaoRepository.findAll();
	}
	
	public List<Acomodacao> obterListaAcomodacaoByQuarto() {
		
		return (List<Acomodacao>) acomodacaoRepository.obterListaAcomodacaoByQuarto( Sort.by(Sort.Direction.ASC, "tipoQuarto"));
	}
	
	
	public void excluir (Integer id) {
		acomodacaoRepository.deleteById(id);
	}
	
}
