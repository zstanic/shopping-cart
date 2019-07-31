package com.shopping.model;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cart {
	
	@Id
	private String id;
	
	private String shopCartStatus;
	
	private String customerEcifId;
	
	private String customerProfileType;
	
	private String createdDate;
	
	private String createdBy;
	
	private String modifiedDate;
	
	private String modifiedBy;
	
	private List<Product> products;

	public String getShopCartStatus() {
		return shopCartStatus;
	}

	public void setShopCartStatus(String shopCartStatus) {
		this.shopCartStatus = shopCartStatus;
	}

	public String getCustomerEcifId() {
		return customerEcifId;
	}

	public void setCustomerEcifId(String customerEcifId) {
		this.customerEcifId = customerEcifId;
	}

	public String getCustomerProfileType() {
		return customerProfileType;
	}

	public void setCustomerProfileType(String customerProfileType) {
		this.customerProfileType = customerProfileType;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [shopCartStatus=" + shopCartStatus + ", customerEcifId=" + customerEcifId
				+ ", customerProfileType=" + customerProfileType + ", createdDate=" + createdDate + ", createdBy="
				+ createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", products=" + products
				+ "]";
	}
	

}
