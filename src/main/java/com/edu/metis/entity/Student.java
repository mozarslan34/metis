package com.edu.metis.entity;

import com.edu.metis.enums.GraduateDegree;
import com.edu.metis.enums.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Emre Dinç
 */
@Entity
@Table(name = EntityConstantsUtil.PREFIX_TB + "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "graduate_school")
    private String graduateSchool;

    @Enumerated(EnumType.STRING)
    private GraduateDegree graduateDegree;

    @Column(name = "school_name")
    private String schoolName;

    @Enumerated(EnumType.STRING)
    private Level level;

    @JoinColumn(name = "membership_type", referencedColumnName = "id")
    @OneToOne
    private MembershipTypes membershipType;

    @OneToMany(mappedBy = "student")
    private List<Appointment> appointment;

}
