package io.spring2go.oneauth.dao.repository;

import io.spring2go.oneauth.dao.entity.GrantTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GrantTypeRepository extends JpaRepository<GrantTypeEntity, Long> {

    Optional<GrantTypeEntity> findOneByValue(String value);
}
