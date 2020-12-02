package com.project.Final_Project.repositories;

import com.project.Final_Project.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Users, Long> {
    List<Users> findAll();
}
