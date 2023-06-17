package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public   class Product {
	
//	Hibernate: select next_val as id_val from hibernate_sequence for update
//	Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//	Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)

	
//generationtype.sequence and generationtype.table
	//if we use .identity in applicationproperties ddl command should not be used
	//generationtype.identity-for this startegy to work first we have to create a table in mysql and explicitly specifythe autoincrement column(AI) as checked for the primary key column and in application.properties file
	//spring.jpa.hibernate.ddl-auto=update, this should not be set.if it is set it should have value as update.
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)//if we do not give anything ,auto is default generationtype or strategy
//generation type is the strategy which the jpa should use or follow to generate primary key values.the default generationtype is auto.when a strategy is not specified jpa uses auto strategy
 //when the underlying database is mysql generationtype.auto means the jpa will create a hibernete sequence in the database for generation of primary keys.
private long productId;//order first productrepo then service then resource
 private String name;
 private String description;
 private BigDecimal price;
 private int qty;
 
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
	this.description = description;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}

 
}
