package com.pedro.andradee.technical.support.repositories;

import com.pedro.andradee.technical.support.models.ScheduleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleModel, Long> {
}
