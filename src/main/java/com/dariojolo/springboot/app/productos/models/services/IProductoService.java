package com.dariojolo.springboot.app.productos.models.services;

import java.util.List;

import com.dariojolo.springboot.app.productos.model.entities.Producto;


public interface IProductoService {

	public List<Producto>findAll();
	
	public Producto findById(Long id);
}
