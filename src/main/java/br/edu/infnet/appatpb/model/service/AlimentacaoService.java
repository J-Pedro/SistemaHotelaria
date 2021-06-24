package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Acomodacao;
import br.edu.infnet.appatpb.model.negocio.Alimentacao;
import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IAcomodacaoRepository;
import br.edu.infnet.appatpb.model.repository.IAlimentacaoRepository;
import br.edu.infnet.appatpb.model.repository.IClienteRepository;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class AlimentacaoService {
	
	@Autowired
	private IAlimentacaoRepository alimentacaoRepository;
	
	
	public void incluir(Alimentacao alimentacao) {
		alimentacaoRepository.save(alimentacao);
	}

	public List<Alimentacao> obterLista() {
		
		return (List<Alimentacao>) alimentacaoRepository.findAll();
	}
	
	
	public void excluir (Integer id) {
		alimentacaoRepository.deleteById(id);
	}
	
}
