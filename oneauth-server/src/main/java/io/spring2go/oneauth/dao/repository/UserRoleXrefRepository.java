package io.spring2go.oneauth.dao.repository;

import io.spring2go.oneauth.dao.entity.UserRoleXrefEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Deprecated
public interface UserRoleXrefRepository extends JpaRepository<UserRoleXrefEntity, Long> {
}
