package br.edu.infnet.appatpb.model.teste;

import br.edu.infnet.appatpb.model.negocio.Usuario;

public class UsuarioTeste {
	public static void main(String[] args) {
			
			Usuario p1 = new Usuario();
			p1.setId(1);
			p1.setNome("Elberth");
			p1.setEmail("elberth@elberth.com");
			System.out.println("Pessoa: " + p1);
			
			Usuario p2 = new Usuario("Maria", "maria@maria.com");
			p2.setId(2);
			System.out.println("Pessoa: " + p2);
		}

}
