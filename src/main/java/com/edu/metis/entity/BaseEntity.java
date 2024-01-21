package com.edu.metis.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Emre Dinç
 */
@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @CreatedBy
    @Column(nullable = false, updatable = false, name = "created_by")
    private String createdBy;

    @CreatedDate
    @Column(nullable = false, updatable = false, name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedBy;

    public abstract Long getId();

    @PrePersist
    public void init() {
        createdAt = LocalDateTime.now();
        //createdBy = SecurityUtils.getCurrentUserLogin().orElse("system");
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
        //updatedBy = SecurityUtils.getCurrentUserLogin().orElse("system");
    }

}
