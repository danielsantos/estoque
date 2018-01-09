package com.danielrocha.estoque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.danielrocha.estoque.model.GrupoProduto;

public interface GrupoProdutoRepository extends JpaRepository<GrupoProduto, Long> {
	
	@Query("select gp from GrupoProduto gp order by gp.id")
	List<GrupoProduto> findAllWithOrder();

}
