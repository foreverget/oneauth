package io.spring2go.oneauth.dao.repository;

import io.spring2go.oneauth.dao.entity.ClientDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientDetailsRepository extends JpaRepository<ClientDetailsEntity, Long> {

    Optional<ClientDetailsEntity> findOneByClientId(String clientId);
}
