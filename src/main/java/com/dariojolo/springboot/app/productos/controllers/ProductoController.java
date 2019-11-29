package com.dariojolo.springboot.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dariojolo.springboot.app.productos.model.entities.Producto;
import com.dariojolo.springboot.app.productos.models.services.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@Value("${server.port}")
	  private String puerto;

	
	@GetMapping("/list")
	public List<Producto>list(){
		System.out.println("Puerto: " + puerto);
		return productoService.findAll();
	}
	
	@GetMapping("/search/{id}")
	public Producto search(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
}
