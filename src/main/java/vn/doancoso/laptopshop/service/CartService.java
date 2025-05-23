package vn.doancoso.laptopshop.service;

import vn.doancoso.laptopshop.repository.CartRepository;
import org.springframework.stereotype.Service;

import vn.doancoso.laptopshop.domain.Cart;
import vn.doancoso.laptopshop.domain.User;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart fetchCartByUser(User user) {
        return this.cartRepository.findByUser(user);
    }

    public Cart fetchCartById(long id) {
        return this.cartRepository.findById(id);
    }

    public Cart saveCart(Cart cart) {
        return this.cartRepository.save(cart);
    }

}
