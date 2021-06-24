package br.edu.infnet.appatpb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.AcomodacaoService;
import br.edu.infnet.appatpb.model.service.AlimentacaoService;
import br.edu.infnet.appatpb.model.service.ClienteService;
import br.edu.infnet.appatpb.model.service.PasseioService;
import br.edu.infnet.appatpb.model.service.ReservaService;
import br.edu.infnet.appatpb.model.service.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private ReservaService reservaService;

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private AcomodacaoService acomodocaoService;
	
	@Autowired
	private AlimentacaoService alimentacaoService;
	
	@Autowired
	private PasseioService passeioService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String telaLogin(Model model) {
		
		
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String telaLogout() {
		return "redirect:/";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String telaIndex(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("usuarioQtde", usuarioService.obterLista().size());
		model.addAttribute("clienteQtde", clienteService.obterListaUser(usuario).size());
		model.addAttribute("reservaQtde", reservaService.obterListaUser(usuario).size());
		model.addAttribute("acomodacaoQtde", acomodocaoService.obterLista().size());
		model.addAttribute("alimentacaoQtde", alimentacaoService.obterLista().size());
		model.addAttribute("passeioQtde", passeioService.obterLista().size());
		
		return "index";
	}
	

}
