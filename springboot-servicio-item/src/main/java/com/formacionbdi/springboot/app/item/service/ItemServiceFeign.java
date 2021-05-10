package com.formacionbdi.springboot.app.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.item.clientes.ProductoClientesRest;
import com.formacionbdi.springboot.app.item.models.Item;

@Service("ServiceFeign")
@Primary
public class ItemServiceFeign implements ItemService {
    
	@Autowired
	private ProductoClientesRest clienteFeign;
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return clienteFeign.listar().stream().map(p-> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new Item(clienteFeign.detalle(id),cantidad);
	}

}
