package com.ma.pedidos.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ma.pedidos.entity.Producto;
import com.ma.pedidos.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired 
	private ProductRepository productRepository;
	
	public Producto saveOrUpdate(Producto producto) {
		return productRepository.save(producto);
	}
	
	public Optional<Producto> findById(Integer id) {
		return this.productRepository.findById(id);
	}
	
	public void delete(Integer id) {
		this.productRepository.deleteById(id);
	}
}
