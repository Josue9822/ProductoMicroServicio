package com.idat.Microservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.Microservicio.model.Producto;
import com.idat.Microservicio.service.ProductoService;

@Controller
@RequestMapping("api/producto/v1")
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Producto> listar(){
		return service.listarProducto();
	}
}
