package edu.mum.ea.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.ea.shop.dao.ProductDao;
import edu.mum.ea.shop.domain.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	
	public void save(Product product){
		productDao.save(product);
	}
	
	public Product get(int id){
		return productDao.findOne(id);
	}
	
	public List<Product> getAll(){
		return productDao.findAll();
	}
	
}