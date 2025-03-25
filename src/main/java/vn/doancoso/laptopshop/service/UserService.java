package vn.doancoso.laptopshop.service;

import java.util.List;
import java.util.Optional;

import vn.doancoso.laptopshop.domain.DTO.RegisterDTO;
import vn.doancoso.laptopshop.repository.RoleRepository;
import vn.doancoso.laptopshop.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import vn.doancoso.laptopshop.domain.Role;
import vn.doancoso.laptopshop.domain.User;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> fetchUsers() {
        return this.userRepository.findAll();
    }

    public List<User> fetchUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public List<User> fetchUsersByEmailAndAddress(String email, String Address) {
        return this.userRepository.findByEmailAndAddress(email, Address);
    }

    public Optional<User> fetchUserById(long id) {
        return this.userRepository.findById(id);
    }

    public String getHomePage() {
        return "Hello From Service";
    }

    public void deleteUserById(long id) {
        this.userRepository.deleteById(id);
    }

    public Optional<Role> fetchRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }

    public User registerDTOtoUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setFullName(registerDTO.getFirstName() + " " + registerDTO.getLastName());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        return user;
    }

    public Boolean checkExistedEmail(String email) {
        return this.userRepository.existsByEmail(email);
    }

    public User fetchUserByEmail(String email) {
        return this.userRepository.findOneByEmail(email);
    }

    public Page<User> fetchUsersPagination(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    public long countUser() {
        return this.userRepository.count();
    }
}
