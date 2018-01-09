package com.danielrocha.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielrocha.estoque.model.GrupoProduto;
import com.danielrocha.estoque.repository.GrupoProdutoRepository;

@Service
public class GrupoProdutoService {

	@Autowired
	private GrupoProdutoRepository repository;
	
	public List<GrupoProduto> findAllWithOrder() {
		return repository.findAllWithOrder(); 
	}
	
	public List<GrupoProduto> findAll() {
		return repository.findAll(); 
	}
	
	public GrupoProduto findOne(Long id) {
		return repository.findOne(id);
	}
	
	public GrupoProduto save(GrupoProduto grupoProduto) {
		return repository.saveAndFlush(grupoProduto);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}

}
