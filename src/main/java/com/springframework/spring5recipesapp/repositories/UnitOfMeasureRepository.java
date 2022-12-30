package com.springframework.spring5recipesapp.repositories;

import com.springframework.spring5recipesapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    <Optional>UnitOfMeasure findByDescription(String description);
}
