package vn.doancoso.laptopshop.service;

import vn.doancoso.laptopshop.repository.OrderDetailRepository;
import org.springframework.stereotype.Service;

import vn.doancoso.laptopshop.domain.OrderDetail;

@Service
public class OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailService(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        return this.orderDetailRepository.save(orderDetail);
    }

    public void deleteOrderDetailById(long id) {
        this.orderDetailRepository.deleteById(id);
    }
}
