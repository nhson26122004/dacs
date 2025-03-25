package vn.doancoso.laptopshop.repository;

import org.springframework.stereotype.Repository;

import vn.doancoso.laptopshop.domain.Role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
