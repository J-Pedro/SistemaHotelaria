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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appatpb.model.negocio.Reserva;
import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.ClienteService;
import br.edu.infnet.appatpb.model.service.ReservaService;
import br.edu.infnet.appatpb.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	
	@Autowired
	private ClienteService clienteService;
	
	
	
	@GetMapping(value = "/reserva")
	public String telaCadastro() {
		return "redirect:/reserva/lista";
	}

	//@RequestMapping(value = "/usuario/incluir", method = RequestMethod.POST)
	@PostMapping(value = "/reserva/incluir")
	public String incluir(Reserva reserva, @SessionAttribute("user") Usuario usuario) {
		
		reserva.setUsuario(usuario);
		reservaService.incluir(reserva);

		return "redirect:/reserva/lista";
	}
	
	@GetMapping(value = "/reserva/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		reservaService.excluir(id);
		return "redirect:/reserva/lista";
	}
	
	@GetMapping(value = "/reserva/lista")
	public String obterLista(Model model, @SessionAttribute("user") Usuario usuario) {
	
		
		model.addAttribute("reservas", reservaService.obterListaUser(usuario));
		model.addAttribute("clientes", clienteService.obterListaUser(usuario));
		
		return "reserva/cadastro";
	}
	

	
	
}
