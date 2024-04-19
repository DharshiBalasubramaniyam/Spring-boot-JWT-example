package com.dharshi.jwtExample.repository;

import com.dharshi.jwtExample.models.ERole;
import com.dharshi.jwtExample.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(ERole name);
}