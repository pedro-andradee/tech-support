package com.pedro.andradee.technical.support.repositories;

import com.pedro.andradee.technical.support.models.TechnicalSupportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalSupportRepository extends JpaRepository<TechnicalSupportModel, Long> {
}
