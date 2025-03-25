package vn.doancoso.laptopshop.service;

import java.util.List;

import vn.doancoso.laptopshop.repository.ProductDetailRepository;
import org.springframework.stereotype.Service;

import vn.doancoso.laptopshop.domain.ProductDetail;

@Service
public class ProductDetailService {
    private final ProductDetailRepository productDetailRepository;

    public ProductDetailService(ProductDetailRepository productDetailRepository) {
        this.productDetailRepository = productDetailRepository;
    }

    public ProductDetail saveProductDetail(ProductDetail productDetail) {
        return this.productDetailRepository.save(productDetail);
    }

    public void deleteProductDetailById(long id) {
        this.productDetailRepository.deleteById(id);
    }

    public List<ProductDetail> fetchProductDetails() {
        return this.productDetailRepository.findAll();
    }
}
