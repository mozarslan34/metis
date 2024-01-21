package com.edu.metis.entity;

import com.edu.metis.enums.GraduateDegree;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;

/**
 * @author Emre Dinç
 */
@Entity
@Table(name = EntityConstantsUtil.PREFIX_TB + "teacher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "introduction", columnDefinition = "TEXT")
    private String introduction;

    @Column(name = "graduate_school")
    private String graduateSchool;

    @Enumerated(EnumType.STRING)
    private GraduateDegree graduateDegree;

    @Column(name = "is_retired")
    private boolean isRetired;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "current_school")
    private String currentSchool;

    @OneToMany(mappedBy = "teacher")
    private List<Appointment> appointment;

}
