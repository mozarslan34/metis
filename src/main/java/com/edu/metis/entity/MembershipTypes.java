package com.edu.metis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Emre Dinç
 */
@Entity
@Table(name = "membership_types")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MembershipTypes extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

    @Column(name = "deadline")
    private String deadline;


}
