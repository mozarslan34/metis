package com.edu.metis.entity;

import com.edu.metis.enums.AppointmentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Emre Dinç
 */
@Entity
@Table(name = "appointment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Appointment extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "student_user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @JoinColumn(name = "teacher_user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;

    @Enumerated(EnumType.STRING)
    private AppointmentType type;

    @Column(name = "other_appointment_type")
    private String otherAppointmentType;

    //todo buraya status düşünmüşüz ama neden ?
}
