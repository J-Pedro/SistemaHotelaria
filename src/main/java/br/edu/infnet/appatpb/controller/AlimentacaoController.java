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
import br.edu.infnet.appatpb.model.negocio.Alimentacao;
import br.edu.infnet.appatpb.model.negocio.Cliente;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AcomodacaoService;
import br.edu.infnet.appatpb.model.service.AlimentacaoService;
import br.edu.infnet.appatpb.model.service.ClienteService;
import br.edu.infnet.appatpb.model.service.UsuarioService;

@Controller
public class AlimentacaoController {
	
	@Autowired
	private AlimentacaoService alimentacaoService;
	
	
	@GetMapping(value = "/alimentacao")
	public String telaCadastro() {
		return "redirect:/alimentacao/lista";
	}

	//@RequestMapping(value = "/usuario/incluir", method = RequestMethod.POST)
	@PostMapping(value = "/alimentacao/incluir")
	public String incluir(Alimentacao alimentacao) {
		
		alimentacaoService.incluir(alimentacao);
	

		return "redirect:/alimentacao/lista";
	}
	
	@GetMapping(value = "/alimentacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		alimentacaoService.excluir(id);
		return "redirect:/alimentacao/lista";
	}
	
	@GetMapping(value = "/alimentacao/lista")
	public String obterLista(Model model) {
		List<Alimentacao> lista = alimentacaoService.obterListaAlimentacaoByRefeicao();
		
		model.addAttribute("alimentacoes", lista);
		
		return "alimentacao/cadastro";
	}
	
}
