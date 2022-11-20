package com.batm.Day2.repositories;

import com.batm.Day2.DTO.User.RegisterDTO;
import com.batm.Day2.entities.User;
import com.batm.Day2.DTO.User.UserGridDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    @Query("""
            select new com.batm.Day2.DTO.User.UserGridDTO(u.username, u.role.name) from User u
            """)
    public List<UserGridDTO> getUsernameRoleName();
//
//    @Query("""
//            select new com.batm.Day2.DTO.User.RegisterDTO(u.username, u.password) from User u
//            """)
//    public List<RegisterDTO> getusernamePassword();
}
