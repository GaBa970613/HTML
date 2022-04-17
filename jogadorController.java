package com.example.jogador.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class jogadorController {

	@GetMapping("jogador/Cadastrar")

	public String getCadastrar() {
		return "Cadastro";

	}

	@GetMapping("/jogador/atualizar")

	public String getAtualiza() {
		return "atualizacao";

	}

	@GetMapping("jogador/listar")
	public String getListar() {
		return "lista";

	}

	@GetMapping("jogador/excluir")
	public String getExcluir() {
		return "Excluir";
	}

}