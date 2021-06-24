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
import br.edu.infnet.appatpb.model.negocio.Servico;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AcomodacaoService;
import br.edu.infnet.appatpb.model.service.ClienteService;
import br.edu.infnet.appatpb.model.service.ServicoService;
import br.edu.infnet.appatpb.model.service.UsuarioService;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	
	@GetMapping(value = "/servico")
	public String telaCadastro() {
		return "redirect:/servico/lista";
	}

	
	@GetMapping(value = "/servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		servicoService.excluir(id);
		return "redirect:/servico/lista";
	}
	
	@GetMapping(value = "/servico/lista")
	public String obterLista(Model model) {
		List<Servico> lista = servicoService.obterLista();
		
		model.addAttribute("servicos", lista);
		
		return "servico/cadastro";
	}
	
}
