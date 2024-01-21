package com.edu.metis.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Emre Dinç
 */
@Getter
@RequiredArgsConstructor
public enum Level {
    SECONDARY("Ortaokul"), HIGHSCHOOL("Lise"), UNIVERSITY("Üniversite");

    private final String displayEducationLevel;
}
