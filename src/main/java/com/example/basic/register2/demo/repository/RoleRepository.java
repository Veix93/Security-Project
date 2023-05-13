package com.example.basic.register2.demo.repository;

import com.example.basic.register2.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String email);
}