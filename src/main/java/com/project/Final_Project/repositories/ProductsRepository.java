package com.project.Final_Project.repositories;

import com.project.Final_Project.model.Products;
import com.project.Final_Project.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {
}
