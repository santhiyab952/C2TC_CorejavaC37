package com.tnsif.smm.Orderitems;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class OrderItemController 
{
 
	
		@Autowired
		private OrderItemService service;
		
		//RESTful API methods for Retrieval Operation 
		@GetMapping("/OrderItem")
		
		public List<OrderItem>list()
		{
			return service.listAll();
		}
		//Retrieve By ID
		@GetMapping("/OrderItem/{OrderItemId}")
		public ResponseEntity<OrderItem> get(@PathVariable Integer OrderItemId)
		{
		
			try
			{
				OrderItem orderitem=service.get(OrderItemId);
				return new ResponseEntity<OrderItem>(orderitem,HttpStatus.OK);
			}
			catch(Exception e)
			{
				return new ResponseEntity<OrderItem>(HttpStatus.NOT_FOUND);
			}
		}
		
		//CREATE
		@PostMapping("/OrderItem")
		public void add(@RequestBody OrderItem orderitem)
		{
			service.save(orderitem);
		}
		
		//UPDATE
		@PutMapping("/OrderItem/{OrderItemId}")
		public ResponseEntity<?>update(@RequestBody OrderItem orderitem,@PathVariable Integer OrderItemId)
		{
			
			try
			{
				OrderItem existorderitem =service.get(OrderItemId);
				service.save(orderitem);
				return new ResponseEntity<OrderItem>(orderitem,HttpStatus.OK);
				
				
	 		}
			catch(Exception e)
			{
				return new ResponseEntity<OrderItem>(HttpStatus.NOT_FOUND);
			}
		}
		
		//DELETE
		@DeleteMapping("/OrderItem/{OrderItemId}")
		public void delete(@PathVariable Integer OrderItemId)
		{
			service.delete(OrderItemId);
		}
		
		
}