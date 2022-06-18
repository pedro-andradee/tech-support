package com.pedro.andradee.technical.support.repositories;

import com.pedro.andradee.technical.support.models.EquipmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentModel, Long> {
}
