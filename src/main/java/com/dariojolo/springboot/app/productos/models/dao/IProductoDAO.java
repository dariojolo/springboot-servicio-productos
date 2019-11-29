package com.dariojolo.springboot.app.productos.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.dariojolo.springboot.app.productos.model.entities.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long>{

}
