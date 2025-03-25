package vn.doancoso.laptopshop.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Product.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Product_ {

	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#image
	 **/
	public static volatile SingularAttribute<Product, String> image;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#sold
	 **/
	public static volatile SingularAttribute<Product, Long> sold;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#factory
	 **/
	public static volatile SingularAttribute<Product, String> factory;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#quantity
	 **/
	public static volatile SingularAttribute<Product, Long> quantity;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#productDetail
	 **/
	public static volatile SingularAttribute<Product, ProductDetail> productDetail;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#price
	 **/
	public static volatile SingularAttribute<Product, Double> price;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#id
	 **/
	public static volatile SingularAttribute<Product, Long> id;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product
	 **/
	public static volatile EntityType<Product> class_;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Product#target
	 **/
	public static volatile SingularAttribute<Product, String> target;

	public static final String IMAGE = "image";
	public static final String SOLD = "sold";
	public static final String FACTORY = "factory";
	public static final String QUANTITY = "quantity";
	public static final String PRODUCT_DETAIL = "productDetail";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String TARGET = "target";

}

