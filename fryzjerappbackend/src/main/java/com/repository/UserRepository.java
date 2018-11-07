package com.repository;


import com.model.AppService;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppService, Integer> {
}
