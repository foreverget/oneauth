package io.spring2go.oneauth.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(of = "authorityName", callSuper = false)
@ToString(of = "authorityName", callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "authorities")
public class AuthorityEntity extends AbstractAuditable<Long> {

    @Size(min = 1, max = 50)
    @Column(name = "authority_name", unique = true, length = 50)
    private String authorityName;

    @NotNull
    @Column(name = "disabled", nullable = false)
    @ColumnDefault("False")
    private boolean disabled;

}
