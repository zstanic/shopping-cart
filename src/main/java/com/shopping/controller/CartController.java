package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.model.Cart;
import com.shopping.model.Product;
import com.shopping.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	private CartService service;

	@RequestMapping(value="/shopping-cart", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> saveCart(@RequestBody Cart crt){
		
		service.saveCart(crt);
		
		return ResponseEntity.ok(crt);
	}
	
	@RequestMapping(value="/shopping-cart", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getAll(){
		
				
		return ResponseEntity.ok(service.getAll());
	}
	
	@RequestMapping(value="/shopping-cart/{customerEcifId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> getByCustomerEcifId(@PathVariable String customerEcifId){
		
				
		return ResponseEntity.ok(service.getByCustomerEcifId(customerEcifId));
	}
	
	@RequestMapping(value="/shopping-cart/{customerEcifId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> delete(@PathVariable String customerEcifId){
		
		Cart crt = service.getByCustomerEcifId(customerEcifId);
		
		service.deleteCart(crt);
		
		return ResponseEntity.ok(crt);
	}
	
	@RequestMapping(value="/shopping-cart/{customerEcifId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> updateCart(@RequestBody Product prd, @PathVariable String customerEcifId){
		
		Cart crt = service.getByCustomerEcifId(customerEcifId);
		
		List<Product> prds = crt.getProducts();
		
		prds.add(prd);
		
		crt.setProducts(prds);
		
		service.saveCart(crt);
		
		return ResponseEntity.ok(crt);
	}

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public ResponseEntity<?> test(){
				
		return ResponseEntity.ok("Ok");
	}
}
