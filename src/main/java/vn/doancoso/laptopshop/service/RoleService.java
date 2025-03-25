package vn.doancoso.laptopshop.service;

import java.util.Optional;

import vn.doancoso.laptopshop.repository.RoleRepository;
import org.springframework.stereotype.Service;

import vn.doancoso.laptopshop.domain.Role;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Optional<Role> fetchRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }
}
