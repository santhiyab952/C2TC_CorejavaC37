package com.tnsif.smm.Orderitems;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class OrderItem 
{ 
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int orderItemId;
		private int orderId;
		private int productId;
		private int quantity;
		private double unitprice;
		
		
		public OrderItem()
		{
			
		}
		public OrderItem(int orderItemId, int orderId, int productId, int quantity, double unitprice) 
		{
			super();
			this.orderItemId = orderItemId;
			this.orderId = orderId;
			this.productId = productId;
			this.quantity = quantity;
			this.unitprice = unitprice;
		}
		
		
		public int getOrderItemId() 
		{
			return orderItemId;
		}
		public void setOrderItemId(int orderItemId)
		{
			this.orderItemId = orderItemId;
		}
	
		public int getOrderId() 
		{
			return orderId;
		}
		public void setOrderId(int orderId)
		{
			this.orderId = orderId;
		}
	
		public int getProductId()
		{
			return productId;
		}
		public void setProductId(int productId)
		{
			this.productId = productId;
		}
		public int getQuantity()
		{
			return quantity;
		}
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		public double getUnitprice()
		{
			return unitprice;
		}
		public void setUnitprice(double unitprice) 
		{
			this.unitprice = unitprice;
		}
		
		
		
		
	
	
	
	
	

}