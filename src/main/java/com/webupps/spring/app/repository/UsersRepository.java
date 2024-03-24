package com.webupps.spring.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.;

import com.webupps.spring.app.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findByName(String name);
    List<Users> findByUsername(String username);
    
}
