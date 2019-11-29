package com.dariojolo.springboot.app.productos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dariojolo.springboot.app.productos.model.entities.Producto;
import com.dariojolo.springboot.app.productos.models.dao.IProductoDAO;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDAO productoDao;
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

}
