package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Acomodacao;
import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Servico;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IAcomodacaoRepository;
import br.edu.infnet.appatpb.model.repository.IClienteRepository;
import br.edu.infnet.appatpb.model.repository.IServicoRepository;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class ServicoService {
	
	@Autowired
	private IServicoRepository servicoRepository;
	

	public List<Servico> obterLista() {
		
		return (List<Servico>) servicoRepository.findAll();
	}
	
	
	public void excluir (Integer id) {
		servicoRepository.deleteById(id);
	}
	
}
