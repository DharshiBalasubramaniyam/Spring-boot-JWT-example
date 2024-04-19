package com.dharshi.jwtExample.factories;

import com.dharshi.jwtExample.exceptions.RoleNotFoundException;
import com.dharshi.jwtExample.models.ERole;
import com.dharshi.jwtExample.models.Role;
import com.dharshi.jwtExample.repository.RoleRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleFactory {
    @Autowired
    RoleRepository roleRepository;

    public Role getInstance(String role) throws RoleNotFoundException {
        switch (role) {
            case "admin" -> {
                return roleRepository.findByName(ERole.ROLE_ADMIN);
            }
            case "user" -> {
                return roleRepository.findByName(ERole.ROLE_USER);
            }
            case "super_admin" -> {
                return roleRepository.findByName(ERole.ROLE_SUPER_ADMIN);
            }
            default -> throw new RoleNotFoundException("No role found for " +  role);
        }
    }

}
