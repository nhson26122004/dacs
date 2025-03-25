package vn.doancoso.laptopshop.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Order.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Order_ {

	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#orderDetails
	 **/
	public static volatile ListAttribute<Order, OrderDetail> orderDetails;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#totalPrice
	 **/
	public static volatile SingularAttribute<Order, Double> totalPrice;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#recieverAddress
	 **/
	public static volatile SingularAttribute<Order, String> recieverAddress;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#paymentMethod
	 **/
	public static volatile SingularAttribute<Order, String> paymentMethod;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#id
	 **/
	public static volatile SingularAttribute<Order, Long> id;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#recieverName
	 **/
	public static volatile SingularAttribute<Order, String> recieverName;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order
	 **/
	public static volatile EntityType<Order> class_;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#user
	 **/
	public static volatile SingularAttribute<Order, User> user;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#paymentStatus
	 **/
	public static volatile SingularAttribute<Order, String> paymentStatus;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#recieverMobile
	 **/
	public static volatile SingularAttribute<Order, String> recieverMobile;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#status
	 **/
	public static volatile SingularAttribute<Order, String> status;
	
	/**
	 * @see vn.doancoso.laptopshop.domain.Order#paymentRef
	 **/
	public static volatile SingularAttribute<Order, String> paymentRef;

	public static final String ORDER_DETAILS = "orderDetails";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String RECIEVER_ADDRESS = "recieverAddress";
	public static final String PAYMENT_METHOD = "paymentMethod";
	public static final String ID = "id";
	public static final String RECIEVER_NAME = "recieverName";
	public static final String USER = "user";
	public static final String PAYMENT_STATUS = "paymentStatus";
	public static final String RECIEVER_MOBILE = "recieverMobile";
	public static final String STATUS = "status";
	public static final String PAYMENT_REF = "paymentRef";

}

