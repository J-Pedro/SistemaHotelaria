package br.edu.infnet.appatpb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appatpb.model.negocio.Acomodacao;
import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Passeio;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AcomodacaoService;
import br.edu.infnet.appatpb.model.service.ClienteService;
import br.edu.infnet.appatpb.model.service.PasseioService;
import br.edu.infnet.appatpb.model.service.UsuarioService;

@Controller
public class PasseioController {
	
	@Autowired
	private PasseioService passeioService;
	
	
	@GetMapping(value = "/passeio")
	public String telaCadastro() {
		return "redirect:/passeio/lista";
	}

	//@RequestMapping(value = "/usuario/incluir", method = RequestMethod.POST)
	@PostMapping(value = "/passeio/incluir")
	public String incluir(Passeio passeio) {
		
		passeioService.incluir(passeio);
	

		return "redirect:/passeio/lista";
	}
	
	@GetMapping(value = "/passeio/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		passeioService.excluir(id);
		return "redirect:/passeio/lista";
	}
	
	@GetMapping(value = "/passeio/lista")
	public String obterLista(Model model) {
		List<Passeio> lista = passeioService.obterLista();
		
		model.addAttribute("passeios", lista);
		
		return "passeio/cadastro";
	}
	
}
