package com.cosyn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product")
@EntityListeners(AuditingEntityListener.class)
@Data
@EqualsAndHashCode
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "productName", nullable = false)
	private String productName;
	@Column(name = "productPrice", nullable = false)
	private String productPrice;
	@Column(name = "productDecs", nullable = false)
	private String productDecs;
	@CreatedBy
	private String createdBy;
	@CreatedDate
	private Date createdAt;
	
//	public Product() {}
//	
//	public Product(int id, String productName, String productPrice, String productDecs, String createdBy,
//			Date createdAt) {
//		super();
//		this.id = id;
//		this.productName = productName;
//		this.productPrice = productPrice;
//		this.productDecs = productDecs;
//		this.createdBy = createdBy;
//		this.createdAt = createdAt;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public String getProductPrice() {
//		return productPrice;
//	}
//
//	public void setProductPrice(String productPrice) {
//		this.productPrice = productPrice;
//	}
//
//	public String getProductDecs() {
//		return productDecs;
//	}
//
//	public void setProductDecs(String productDecs) {
//		this.productDecs = productDecs;
//	}
//
//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
//	
	
}
