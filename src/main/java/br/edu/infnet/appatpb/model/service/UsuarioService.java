package br.edu.infnet.appatpb.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	public String obterStatus(Usuario usuario) {
		return usuario.calcularSalarioAnual() > 999 ? 
				usuario.getNome() + ", que pessoa rica" : "Poxa, "+ usuario.getNome()+"!!! Tá difícil, né?!"; 

	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public List<Usuario> obterLista() {
		
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public void excluir (Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	
}
