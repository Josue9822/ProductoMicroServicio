package com.idat.Microservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Microservicio.model.Producto;
import com.idat.Microservicio.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> listarProducto() {
		return repository.findAll();
	}

}
