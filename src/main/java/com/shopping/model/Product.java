package com.shopping.model;

import javax.persistence.Id;

public class Product {
	
	@Id
	private String id;
	
	private String productStatus;
	
	private String productCode;
	
	private String productName;
	
	private String productCategory;
	
	private String productBundleCode;
	
	private String createdDate;
	
	private String createdBy;
	
	private String closedDate;
	
	private String closedBy;

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBundleCode() {
		return productBundleCode;
	}

	public void setProductBundleCode(String productBundleCode) {
		this.productBundleCode = productBundleCode;
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

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}

	public String getClosedBy() {
		return closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	@Override
	public String toString() {
		return "Product [productStatus=" + productStatus + ", productCode=" + productCode + ", productName="
				+ productName + ", productCategory=" + productCategory + ", productBundleCode=" + productBundleCode
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", closedDate=" + closedDate
				+ ", closedBy=" + closedBy + "]";
	}
	
	
}
