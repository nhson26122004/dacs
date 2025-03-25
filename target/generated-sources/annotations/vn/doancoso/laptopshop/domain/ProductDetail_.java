package vn.doancoso.laptopshop.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProductDetail.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class ProductDetail_ {

	
	/**
	 * @see vn.doancoso.laptopshop.domain.ProductDetail#detailDesc
	 **/
	public static volatile SingularAttribute<ProductDetail, String> detailDesc;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.ProductDetail#product
	 **/
	public static volatile SingularAttribute<ProductDetail, Product> product;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.ProductDetail#shortDesc
	 **/
	public static volatile SingularAttribute<ProductDetail, String> shortDesc;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.ProductDetail#id
	 **/
	public static volatile SingularAttribute<ProductDetail, Long> id;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.ProductDetail
	 **/
	public static volatile EntityType<ProductDetail> class_;

	public static final String DETAIL_DESC = "detailDesc";
	public static final String PRODUCT = "product";
	public static final String SHORT_DESC = "shortDesc";
	public static final String ID = "id";

}

