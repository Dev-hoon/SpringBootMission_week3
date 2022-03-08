package com.example.basic.repository;


import com.example.basic.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BoardRepository extends CrudRepository<BoardEntity, Long> {
    Optional<BoardEntity> findByName(String name);
}
