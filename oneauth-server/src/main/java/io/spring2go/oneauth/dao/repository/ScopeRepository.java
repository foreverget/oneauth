package io.spring2go.oneauth.dao.repository;

import io.spring2go.oneauth.dao.entity.ScopeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ScopeRepository extends JpaRepository<ScopeEntity, Long> {

    Optional<ScopeEntity> findOneByValue(String value);
}
