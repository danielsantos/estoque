package com.danielrocha.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.danielrocha.estoque.model.GrupoProduto;
import com.danielrocha.estoque.service.GrupoProdutoService;

@Controller
@RequestMapping("/gruposProduto")
public class GrupoProdutoController {
	
	@Autowired
	private GrupoProdutoService service;

	@RequestMapping(method = RequestMethod.GET)
	public String listar(ModelMap modelMap) {
		List<GrupoProduto> gruposProduto = service.findAll();
		modelMap.addAttribute("gruposProduto", gruposProduto);
		return "/gruposProduto/listar";
	}
	
}
