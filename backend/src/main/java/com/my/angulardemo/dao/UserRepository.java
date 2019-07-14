package com.my.angulardemo.dao;

import com.my.angulardemo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
