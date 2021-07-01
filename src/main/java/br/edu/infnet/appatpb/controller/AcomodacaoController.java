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
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AcomodacaoService;
import br.edu.infnet.appatpb.model.service.ClienteService;
import br.edu.infnet.appatpb.model.service.UsuarioService;

@Controller
public class AcomodacaoController {
	
	@Autowired
	private AcomodacaoService acomodacaoService;
	
	
	@GetMapping(value = "/acomodacao")
	public String telaCadastro() {
		return "redirect:/acomodacao/lista";
	}

	//@RequestMapping(value = "/usuario/incluir", method = RequestMethod.POST)
	@PostMapping(value = "/acomodacao/incluir")
	public String incluir(Acomodacao acomodacao) {
		
		acomodacaoService.incluir(acomodacao);
	

		return "redirect:/acomodacao/lista";
	}
	
	@GetMapping(value = "/acomodacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		acomodacaoService.excluir(id);
		return "redirect:/acomodacao/lista";
	}
	
	@GetMapping(value = "/acomodacao/lista")
	public String obterLista(Model model) {
		List<Acomodacao> lista = acomodacaoService.obterListaAcomodacaoByQuarto();
		
		model.addAttribute("acomodacoes", lista);
		
		return "acomodacao/cadastro";
	}
	
}
