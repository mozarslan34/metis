package com.edu.metis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Emre Dinç
 */
@Entity
@Table(name = EntityConstantsUtil.PREFIX_TB + "membership_types")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MembershipTypes extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

    @Column(name = "deadline")
    private String deadline;

    @OneToOne(mappedBy = "membershipType")
    private Student student;


}
