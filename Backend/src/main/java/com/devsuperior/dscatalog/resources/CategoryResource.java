package com.devsuperior.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController
@RequestMapping(value ="/categories")//rota rest
public class CategoryResource {// metodo 
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){//retorno do metodo de pesponsit encapsulamenla a resposta http 
		List<Category> list = new ArrayList<>();//declara e instaciar uma lista
		list.add(new Category(1L,"Books")); // adicionando um novo objeto na categoria na lista (l de long|)
		list.add( new Category(2L,"eletronicos"));//inclui 
	return ResponseEntity.ok().body(list);// 
	}
	
}
