package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Reserva;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IClienteRepository;
import br.edu.infnet.appatpb.model.repository.IReservaRepository;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class ReservaService {
	
	@Autowired
	private IReservaRepository reservaRepository;
	
	
	public void incluir(Reserva reserva) {
		reservaRepository.save(reserva);
	}

	public List<Reserva> obterLista() {
		
		return (List<Reserva>) reservaRepository.findAll();
	}
	
	public List<Reserva> obterListaUser(Usuario usuario) {
		
		return (List<Reserva>) reservaRepository.obterListaUser(usuario.getId(), Sort.by(Sort.Direction.ASC, "cliente.nome"));
	}
	
	public void excluir (Integer id) {
		reservaRepository.deleteById(id);
	}
	
}
