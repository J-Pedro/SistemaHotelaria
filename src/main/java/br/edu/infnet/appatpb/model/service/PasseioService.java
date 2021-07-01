package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Acomodacao;
import br.edu.infnet.appatpb.model.negocio.Alimentacao;
import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Passeio;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IAcomodacaoRepository;
import br.edu.infnet.appatpb.model.repository.IClienteRepository;
import br.edu.infnet.appatpb.model.repository.IPasseioRepository;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class PasseioService {
	
	@Autowired
	private IPasseioRepository passeioRepository;
	
	
	public void incluir(Passeio passeio) {
		passeioRepository.save(passeio);
	}

	public List<Passeio> obterLista() {
		
		return (List<Passeio>) passeioRepository.findAll();
	}
	
	public List<Passeio> obterListaPasseioBynomePasseio() {
		
		return (List<Passeio>) passeioRepository.obterListaPasseioBynomePasseio( Sort.by(Sort.Direction.ASC, "nomePasseio"));
	}
	
	
	public void excluir (Integer id) {
		passeioRepository.deleteById(id);
	}
	
}
