package com.edu.metis.entity;

import com.edu.metis.enums.GraduateDegree;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.List;

/**
 * @author Emre Dinç
 */
@Entity
@Table(name = "teacher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "introduction", columnDefinition = "TEXT")
    private String introduction;

    @Enumerated(EnumType.STRING)
    private GraduateDegree graduateSchool;

    @Column(name = "graduate_degree")
    private String graduateDegree;

    @Column(name = "is_retired")
    private boolean isRetired;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "current_school")
    private String currentSchool;

}
