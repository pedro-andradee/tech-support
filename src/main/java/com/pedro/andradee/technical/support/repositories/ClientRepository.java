package com.pedro.andradee.technical.support.repositories;

import com.pedro.andradee.technical.support.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
