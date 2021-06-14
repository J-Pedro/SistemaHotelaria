package br.edu.infnet.appatpb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String telaLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String telaIndex() {
		return "index";
	}
	

}
