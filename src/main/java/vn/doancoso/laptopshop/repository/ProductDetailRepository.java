package vn.doancoso.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.doancoso.laptopshop.domain.ProductDetail;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
    ProductDetail save(ProductDetail productDetail);

    void deleteById(long id);
}
