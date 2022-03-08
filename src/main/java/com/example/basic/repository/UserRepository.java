package com.example.basic.repository;

import com.example.basic.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByName(String name);

    Optional<UserEntity> findByEmail(String email);
}
