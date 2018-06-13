package io.spring2go.oneauth.dao.repository;

import io.spring2go.oneauth.dao.entity.RedirectUriEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RedirectUriRepository extends JpaRepository<RedirectUriEntity, Long> {

    Optional<RedirectUriEntity> findOneByValue(String value);
}

