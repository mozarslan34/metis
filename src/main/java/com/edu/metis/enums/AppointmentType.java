package com.edu.metis.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Emre Dinç
 */
@Getter
@RequiredArgsConstructor
public enum AppointmentType {
    QUESTION("Soru Çözümü"), LECTURE("Konu Anlatımı"), OTHER("Diğer");

    private final String displayAppointmentType;
}
